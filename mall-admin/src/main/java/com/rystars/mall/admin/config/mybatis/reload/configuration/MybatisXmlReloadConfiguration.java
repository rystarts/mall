package com.rystars.mall.admin.config.mybatis.reload.configuration;

import com.rystars.mall.admin.config.mybatis.reload.MybatisXmlReload;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.List;

/**
 * mybatis xml file hot reload configuration.
 *
 * @author rystars
 */
@Configuration
@EnableConfigurationProperties({MybatisXmlReloadProperties.class})
public class MybatisXmlReloadConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MybatisXmlReload mybatisXmlReload(MybatisXmlReloadProperties prop,
                                             List<SqlSessionFactory> sqlSessionFactories) throws IOException {
        MybatisXmlReload mybatisXmlReload = new MybatisXmlReload(prop, sqlSessionFactories);
        if (prop.getEnabled()) {
            mybatisXmlReload.xmlReload();
        }
        return mybatisXmlReload;
    }

}
