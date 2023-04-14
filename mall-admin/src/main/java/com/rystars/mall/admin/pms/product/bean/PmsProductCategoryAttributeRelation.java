package com.rystars.mall.admin.pms.product.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_product_category_attribute_relation")
@Schema(description = "pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)")
public class PmsProductCategoryAttributeRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productCategoryId")
    private Long productCategoryId;

    @Schema(description = "productAttributeId")
    private Long productAttributeId;

}




