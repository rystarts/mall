package com.rystars.mall.admin.pms.product.mapper;

import com.rystars.mall.admin.pms.product.bean.PmsProductCategoryAttributeRelation;
import com.rystars.mall.admin.frame.base.mapper.IBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 【pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)】Mapper
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Mapper
public interface PmsProductCategoryAttributeRelationMapper extends IBaseMapper<PmsProductCategoryAttributeRelation> {

}




