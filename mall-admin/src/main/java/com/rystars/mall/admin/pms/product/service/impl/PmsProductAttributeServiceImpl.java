package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.pms.product.bean.PmsProductAttribute;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeService;
import com.rystars.mall.admin.pms.product.mapper.PmsProductAttributeMapper;
import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_attribute(商品属性参数表)】ServiceImpl
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductAttributeServiceImpl extends IBaseServiceImpl<PmsProductAttributeMapper, PmsProductAttribute> implements PmsProductAttributeService{

    private final PmsProductAttributeMapper pmsProductAttributeMapper;

}




