package com.rystars.mall.admin.config.mybatis.reload;

import com.rystars.mall.admin.config.mybatis.reload.configuration.MybatisXmlReloadProperties;
import io.methvin.watcher.DirectoryWatcher;
import org.apache.ibatis.builder.xml.XMLMapperBuilder;
import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.parsing.XNode;
import org.apache.ibatis.parsing.XPathParser;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Stream;

/**
 * mybatis-xml-reload 核心xml热加载逻辑
 * @author rystars
 */
public class MybatisXmlReload {

    private static final Logger logger = LoggerFactory.getLogger(MybatisXmlReload.class);
    public static final String MYBATIS_CONFIGURATION = "MybatisConfiguration";

    /**
     * Pattern CLASS_PATH_PATTERN = Pattern.compile("(classpath\\*?:)(\\w*)");
     */
    public static final String CLASS_PATH_TARGET = File.separator + "target" + File.separator + "classes";
    public static final String MAVEN_RESOURCES = "/src/main/resources";
    public static final String XML_RELOAD = "xml-reload";


    private final MybatisXmlReloadProperties prop;
    private final List<SqlSessionFactory> sqlSessionFactories;

    public MybatisXmlReload(MybatisXmlReloadProperties prop, List<SqlSessionFactory> sqlSessionFactories) {
        this.prop = prop;
        this.sqlSessionFactories = sqlSessionFactories;
    }

    /**
     * 根据反射获取Configuration对象中属性
     *
     * @param targetConfiguration targetConfiguration
     * @param aClass              aClass
     * @param filed               filed
     * @return return
     * @throws NoSuchFieldException   NoSuchFieldException
     * @throws IllegalAccessException IllegalAccessException
     */
    private static Object getFieldValue(Configuration targetConfiguration, Class<?> aClass,
                                        String filed) throws NoSuchFieldException, IllegalAccessException {
        Field resultMapsField = aClass.getDeclaredField(filed);
        resultMapsField.setAccessible(true);
        return resultMapsField.get(targetConfiguration);
    }

    public void xmlReload() throws IOException {
        PathMatchingResourcePatternResolver patternResolver = new PathMatchingResourcePatternResolver();
        List<Resource> mapperLocationsTmp = Stream.of(Optional.of(prop.getMapperLocations()).orElse(new String[0]))
                .flatMap(location -> Stream.of(getResources(patternResolver, location))).toList();

        List<Resource> mapperLocations = new ArrayList<>(mapperLocationsTmp.size() * 2);
        Set<Path> locationPatternSet = new HashSet<>();
        for (Resource mapperLocation : mapperLocationsTmp) {
            mapperLocations.add(mapperLocation);
            String absolutePath = mapperLocation.getFile().getAbsolutePath();
            File tmpFile = new File(absolutePath.replace(CLASS_PATH_TARGET, MAVEN_RESOURCES));
            if (tmpFile.exists()) {
                locationPatternSet.add(Path.of(tmpFile.getParent()));
                FileSystemResource fileSystemResource = new FileSystemResource(tmpFile);
                mapperLocations.add(fileSystemResource);
            }
        }
        List<Path> rootPaths = new ArrayList<>(locationPatternSet);
        DirectoryWatcher watcher = getDirectoryWatcher(mapperLocations, rootPaths);
        ThreadFactory threadFactory = getThreadFactory();
        watcher.watchAsync(new ScheduledThreadPoolExecutor(1, threadFactory));

    }

    @SuppressWarnings("unchecked")
    private DirectoryWatcher getDirectoryWatcher(List<Resource> mapperLocations, List<Path> rootPaths) throws IOException {
        return DirectoryWatcher.builder()
                .paths(rootPaths)
                .listener(event -> {
                    switch (event.eventType()) {
                        case CREATE: /* file created */
                            break;
                        case MODIFY: /* file modified */
                            Path modifyPath = event.path();
                            String absolutePath = modifyPath.toFile().getAbsolutePath();
                            logger.info("mybatis xml file has changed:" + modifyPath);
                            for (SqlSessionFactory sqlSessionFactory : sqlSessionFactories) {
                                try {
                                    Configuration targetConfiguration = sqlSessionFactory.getConfiguration();
                                    Class<?> tClass = targetConfiguration.getClass(), aClass = targetConfiguration.getClass();
                                    if (MYBATIS_CONFIGURATION.equals(targetConfiguration.getClass().getSimpleName())) {
                                        aClass = Configuration.class;
                                    }
                                    Set<String> loadedResources = (Set<String>) getFieldValue(targetConfiguration, aClass, "loadedResources");
                                    loadedResources.clear();

                                    Map<String, ResultMap> resultMaps = (Map<String, ResultMap>) getFieldValue(targetConfiguration, tClass, "resultMaps");
                                    Map<String, XNode> sqlFragmentsMaps = (Map<String, XNode>) getFieldValue(targetConfiguration, tClass, "sqlFragments");
                                    Map<String, MappedStatement> mappedStatementMaps = (Map<String, MappedStatement>) getFieldValue(targetConfiguration, tClass, "mappedStatements");

                                    for (Resource mapperLocation : mapperLocations) {
                                        if (!absolutePath.equals(mapperLocation.getFile().getAbsolutePath())) {
                                            continue;
                                        }
                                        XPathParser parser = new XPathParser(mapperLocation.getInputStream(), true, targetConfiguration.getVariables(), new XMLMapperEntityResolver());
                                        XNode mapperXnode = parser.evalNode("/mapper");
                                        List<XNode> resultMapNodes = mapperXnode.evalNodes("/mapper/resultMap");
                                        String namespace = mapperXnode.getStringAttribute("namespace");
                                        for (XNode xNode : resultMapNodes) {
                                            String id = xNode.getStringAttribute("id", xNode.getValueBasedIdentifier());
                                            resultMaps.remove(namespace + "." + id);
                                        }

                                        List<XNode> sqlNodes = mapperXnode.evalNodes("/mapper/sql");
                                        for (XNode sqlNode : sqlNodes) {
                                            String id = sqlNode.getStringAttribute("id", sqlNode.getValueBasedIdentifier());
                                            sqlFragmentsMaps.remove(namespace + "." + id);
                                        }

                                        List<XNode> msNodes = mapperXnode.evalNodes("select|insert|update|delete");
                                        for (XNode msNode : msNodes) {
                                            String id = msNode.getStringAttribute("id", msNode.getValueBasedIdentifier());
                                            mappedStatementMaps.remove(namespace + "." + id);
                                        }
                                        try {
                                            XMLMapperBuilder xmlMapperBuilder = new XMLMapperBuilder(mapperLocation.getInputStream(),
                                                    targetConfiguration, mapperLocation.toString(), targetConfiguration.getSqlFragments());
                                            xmlMapperBuilder.parse();
                                        } catch (Exception e) {
                                            logger.error(e.getMessage(), e);
                                        }
                                        logger.info("Parsed mapper file: '" + mapperLocation + "'");
                                    }
                                } catch (Exception e) {
                                    logger.error(e.getMessage(), e);
                                }
                            }
                            break;
                        case DELETE: /* file deleted */
                            break;
                    }
                })
                // .fileHashing(false) // defaults to true
                // .logger(logger) // defaults to LoggerFactory.getLogger(DirectoryWatcher.class)
                // .watchService(watchService) // defaults based on OS to either JVM WatchService or the JNA macOS WatchService
                .build();
    }

    private static ThreadFactory getThreadFactory() {
        return r -> {
            Thread thread = new Thread(r);
            thread.setName(XML_RELOAD);
            thread.setDaemon(true);
            return thread;
        };
    }

    /**
     * 根据xml路径获取对应实际文件
     *
     * @param location 文件位置
     * @return Resource[]
     */
    private Resource[] getResources(PathMatchingResourcePatternResolver patternResolver, String location) {
        try {
            return patternResolver.getResources(location);
        } catch (IOException e) {
            return new Resource[0];
        }
    }
}
