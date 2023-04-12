package com.rystars.mall.admin.pms.brand;

import com.rystars.mall.admin.pms.brand.bean.PmsBrand;
import com.rystars.mall.admin.pms.brand.mapper.PmsBrandMapper;
import com.rystars.mall.admin.pms.brand.service.PmsBrandService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author rystars
 * @date 2023/4/12
 */
@SpringBootTest
public class PmsBrandTest {

    private final Logger logger = LoggerFactory.getLogger(PmsBrandTest.class);

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Autowired
    private PmsBrandService pmsBrandService;

    @Test
    public void selectAll() {
        List<PmsBrand> pmsBrands = pmsBrandMapper.selectList(null);
        pmsBrands.forEach(f -> logger.info(f.toString()));
    }

    @Test
    public void selectOne() {
        try {
            PmsBrand one = pmsBrandService.getOne(null);
            logger.info(one.toString());
        } catch (Exception e) {

        }
    }

    @Test
    public void selectFirst() {
        PmsBrand one = pmsBrandService.getFirst(null);
        logger.info(one.toString());
    }

}
