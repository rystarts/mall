package com.rystars.mall.admin.pms.product.bean;

import java.util.*;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.io.Serial;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.rystars.mall.admin.frame.base.bean.BaseBean;

/**
 * 【pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_product_category_attribute_relation")
@Schema(description = "pms_product_category_attribute_relation(产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）)")
public class PmsProductCategoryAttributeRelation extends BaseBean<PmsProductCategoryAttributeRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "productCategoryId")
    private Long productCategoryId;
    
    @Schema(description = "productAttributeId")
    private Long productAttributeId;

}



