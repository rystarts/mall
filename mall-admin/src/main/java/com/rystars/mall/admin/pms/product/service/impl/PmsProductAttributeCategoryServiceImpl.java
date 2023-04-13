package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.product.bean.PmsProductAttributeCategory;
import com.rystars.mall.admin.pms.product.mapper.PmsProductAttributeCategoryMapper;
import com.rystars.mall.admin.pms.product.service.PmsProductAttributeCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_attribute_category(产品属性分类表)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductAttributeCategoryServiceImpl extends IBaseServiceImpl<PmsProductAttributeCategoryMapper, PmsProductAttributeCategory> implements PmsProductAttributeCategoryService {

    private final PmsProductAttributeCategoryMapper pmsProductAttributeCategoryMapper;

}




