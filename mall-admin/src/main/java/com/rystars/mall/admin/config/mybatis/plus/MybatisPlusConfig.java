package com.rystars.mall.admin.config.mybatis.plus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.dialects.MySqlDialect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rystars
 * @date 2023/4/12
 * 扫描mapper接口文件夹
 */
@Configuration
@MapperScan("com.rystars.mall.admin.**.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件配置
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        // 溢出总页数后是否进行处理(默认不处理
        paginationInnerInterceptor.setOverflow(true);
        // 单页分页条数限制(默认无限制
        paginationInnerInterceptor.setMaxLimit(500L);
        // 数据库类型
        paginationInnerInterceptor.setDbType(DbType.MYSQL);
        // 方言实现类
        paginationInnerInterceptor.setDialect(new MySqlDialect());
        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }

}
