package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.product.bean.PmsProductCategory;
import com.rystars.mall.admin.pms.product.mapper.PmsProductCategoryMapper;
import com.rystars.mall.admin.pms.product.service.PmsProductCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_category(产品分类)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductCategoryServiceImpl extends IBaseServiceImpl<PmsProductCategoryMapper, PmsProductCategory> implements PmsProductCategoryService {

    private final PmsProductCategoryMapper pmsProductCategoryMapper;

}




