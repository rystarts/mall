package com.rystars.mall.admin.ums.menu.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【ums_menu(后台菜单表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:13:01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_menu")
@Schema(description = "ums_menu(后台菜单表)")
public class UmsMenu extends BaseBean {

    @TableId(type = IdType.AUTO)
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




