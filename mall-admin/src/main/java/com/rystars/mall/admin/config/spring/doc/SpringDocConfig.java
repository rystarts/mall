package com.rystars.mall.admin.config.spring.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rystars
 * @date 2023/4/10
 */

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI().info(new Info()
                .title("rystars mall api")
                .description("rystars mall API")
                .version("v1.0.0")
                .license(new License()
                        .name("mall git url -->>>")
                        .url("https://github.com/rystarts/mall")
                ));
    }

    @Bean
    public GroupedOpenApi pmsApi() {
        return GroupedOpenApi.builder()
                .group("pms")
                .pathsToMatch("/pms/**")
                .build();
    }

    @Bean
    public GroupedOpenApi cmsApi() {
        return GroupedOpenApi.builder()
                .group("cms")
                .pathsToMatch("/cms/**")
                .build();
    }

}
