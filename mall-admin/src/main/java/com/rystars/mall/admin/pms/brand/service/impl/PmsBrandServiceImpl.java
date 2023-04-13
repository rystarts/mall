package com.rystars.mall.admin.pms.brand.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.brand.bean.PmsBrand;
import com.rystars.mall.admin.pms.brand.mapper.PmsBrandMapper;
import com.rystars.mall.admin.pms.brand.service.PmsBrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_brand(品牌表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:50:21
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsBrandServiceImpl extends IBaseServiceImpl<PmsBrandMapper, PmsBrand> implements PmsBrandService {

    private final PmsBrandMapper pmsBrandMapper;

}




