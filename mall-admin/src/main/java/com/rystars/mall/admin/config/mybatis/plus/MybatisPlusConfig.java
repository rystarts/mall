package com.rystars.mall.admin.config.mybatis.plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author rystars
 * @date 2023/4/12
 * 扫描mapper接口文件夹
 */
@Configuration
@MapperScan("com.rystars.mall.admin.**.mapper")
public class MybatisPlusConfig {
}
