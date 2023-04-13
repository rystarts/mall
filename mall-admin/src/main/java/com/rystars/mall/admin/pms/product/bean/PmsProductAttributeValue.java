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
 * 【pms_product_attribute_value(存储产品参数信息的表)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_product_attribute_value")
@Schema(description = "pms_product_attribute_value(存储产品参数信息的表)")
public class PmsProductAttributeValue extends BaseBean<PmsProductAttributeValue> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "productId")
    private Long productId;
    
    @Schema(description = "productAttributeId")
    private Long productAttributeId;
    
    @Schema(description = "手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

}




