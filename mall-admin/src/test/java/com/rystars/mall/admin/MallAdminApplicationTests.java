package com.rystars.mall.admin;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class MallAdminApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(MallAdminApplicationTests.class);

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1() {
        if (dataSource instanceof DruidDataSource) {
            logger.info(dataSource.getClass().getName());
        }
    }

}
