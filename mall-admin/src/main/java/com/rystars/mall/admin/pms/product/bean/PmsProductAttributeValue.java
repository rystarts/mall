package com.rystars.mall.admin.pms.product.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【pms_product_attribute_value(存储产品参数信息的表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_product_attribute_value")
@Schema(description = "pms_product_attribute_value(存储产品参数信息的表)")
public class PmsProductAttributeValue extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "productAttributeId")
    private Long productAttributeId;

    @Schema(description = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

}




