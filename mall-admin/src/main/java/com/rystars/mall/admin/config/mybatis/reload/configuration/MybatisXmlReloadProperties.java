package com.rystars.mall.admin.config.mybatis.reload.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * mybatis-xml-reload配置类
 * @author rystars
 */
@ConfigurationProperties(prefix = "mybatis-xml-reload")
public class MybatisXmlReloadProperties {
    private boolean enabled;

    private String[] mapperLocations;

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String[] getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String[] mapperLocations) {
        this.mapperLocations = mapperLocations;
    }
}
