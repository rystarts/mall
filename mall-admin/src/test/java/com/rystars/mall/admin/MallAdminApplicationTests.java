package com.rystars.mall.admin;

import com.rystars.mall.admin.urils.redis.RedisHelper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class MallAdminApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private RedisHelper redisHelper;

    @Test
    public void test1() {
        log.info((String) redisHelper.get("rrr"));
        System.out.println(redisHelper.get("rrr"));
    }

}
