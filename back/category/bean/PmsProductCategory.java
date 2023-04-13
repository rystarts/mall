package com.rystars.mall.admin.pms.product.category.bean;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

/**
 * @author rystars
 * @date 2023/4/6
 * 产品分类
 * Schema 类描述 属性描述
 * description-描述 example-举例
 */
@Data
@Schema(description = "产品分类信息")
public class PmsProductCategory implements Serializable {

    @Schema(description = "主键", example = "1")
    private Long id;

    @Schema(description = "上级分类的编号：0表示一级分类")
    private Long parentId;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "分类级别：0->1级；1->2级")
    private Integer level;

    @Schema(description = "商品数量")
    private Integer productCount;

    @Schema(description = "商品单位")
    private String productUnit;

    @Schema(description = "是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    @Schema(description = "显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "图标")
    private String icon;

    @Schema(description = "关键字")
    private String keywords;

    @Schema(description = "描述")
    private String description;

}
