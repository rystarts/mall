package com.rystars.mall.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author rystars
 */
@SpringBootApplication
@EnableConfigurationProperties
public class MallAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallAdminApplication.class, args);
	}

}
