package com.rystars.mall.admin.pms.product.service.impl;

import com.rystars.mall.admin.frame.base.service.impl.IBaseServiceImpl;
import com.rystars.mall.admin.pms.product.bean.PmsProductCategoryAttributeRelation;
import com.rystars.mall.admin.pms.product.mapper.PmsProductCategoryAttributeRelationMapper;
import com.rystars.mall.admin.pms.product.service.PmsProductCategoryAttributeRelationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 【pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)】ServiceImpl
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class PmsProductCategoryAttributeRelationServiceImpl extends IBaseServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements PmsProductCategoryAttributeRelationService {

    private final PmsProductCategoryAttributeRelationMapper pmsProductCategoryAttributeRelationMapper;

}




