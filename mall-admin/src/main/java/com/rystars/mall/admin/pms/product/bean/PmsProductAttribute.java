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
 * 【pms_product_attribute(商品属性参数表)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_product_attribute")
@Schema(description = "pms_product_attribute(商品属性参数表)")
public class PmsProductAttribute extends BaseBean<PmsProductAttribute> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "productAttributeCategoryId")
    private Long productAttributeCategoryId;
    
    @Schema(description = "name")
    private String name;
    
    @Schema(description = "属性选择类型：0->唯一；1->单选；2->多选")
    private Integer selectType;
    
    @Schema(description = "属性录入方式：0->手工录入；1->从列表中选取")
    private Integer inputType;
    
    @Schema(description = "可选值列表，以逗号隔开")
    private String inputList;
    
    @Schema(description = "排序字段：最高的可以单独上传图片")
    private Integer sort;
    
    @Schema(description = "分类筛选样式：1->普通；1->颜色")
    private Integer filterType;
    
    @Schema(description = "检索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
    private Integer searchType;
    
    @Schema(description = "相同属性产品是否关联；0->不关联；1->关联")
    private Integer relatedStatus;
    
    @Schema(description = "是否支持手动新增；0->不支持；1->支持")
    private Integer handAddStatus;
    
    @Schema(description = "属性的类型；0->规格；1->参数")
    private Integer type;

}




