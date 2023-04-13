package com.rystars.mall.admin.ums.menu.bean;

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
 * 【ums_menu(后台菜单表)】Bean
 * @author rystars
 * @date 2023-04-13 10:59:04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_menu")
@Schema(description = "ums_menu(后台菜单表)")
public class UmsMenu extends BaseBean<UmsMenu> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "父级ID")
    private Long parentId;
    
    @Schema(description = "创建时间")
    private Date createTime;
    
    @Schema(description = "菜单名称")
    private String title;
    
    @Schema(description = "菜单级数")
    private Integer level;
    
    @Schema(description = "菜单排序")
    private Integer sort;
    
    @Schema(description = "前端名称")
    private String name;
    
    @Schema(description = "前端图标")
    private String icon;
    
    @Schema(description = "前端隐藏")
    private Integer hidden;

}




