package com.rystars.mall.admin.pms.product.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * 【pms_product_category(产品分类)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_product_category")
@Schema(description = "pms_product_category(产品分类)")
public class PmsProductCategory extends BaseBean<PmsProductCategory> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "上机分类的编号：0表示一级分类")
    private Long parentId;

    @Schema(description = "name")
    private String name;

    @Schema(description = "分类级别：0->1级；1->2级")
    private Integer level;

    @Schema(description = "productCount")
    private Integer productCount;

    @Schema(description = "productUnit")
    private String productUnit;

    @Schema(description = "是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    @Schema(description = "显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @Schema(description = "sort")
    private Integer sort;

    @Schema(description = "图标")
    private String icon;

    @Schema(description = "keywords")
    private String keywords;

    @Schema(description = "描述")
    private String description;

}




