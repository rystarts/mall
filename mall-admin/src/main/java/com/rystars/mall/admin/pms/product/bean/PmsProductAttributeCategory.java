package com.rystars.mall.admin.pms.product.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【pms_product_attribute_category(产品属性分类表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_product_attribute_category")
@Schema(description = "pms_product_attribute_category(产品属性分类表)")
public class PmsProductAttributeCategory extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "name")
    private String name;

    @Schema(description = "属性数量")
    private Integer attributeCount;

    @Schema(description = "参数数量")
    private Integer paramCount;

}




