package com.rystars.mall.admin.pms.product.category.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author rystars
 * @date 2023/4/6
 * 产品分类
 */
@Data
public class PmsProductCategory implements Serializable {

    private Long id;
    private Long parentId;
    private String name;
    private Integer level;
    private Integer productCount;
    private String productUnit;
    private Integer navStatus;
    private Integer showStatus;
    private Integer sort;
    private String icon;
    private String keywords;
    private String description;

}
