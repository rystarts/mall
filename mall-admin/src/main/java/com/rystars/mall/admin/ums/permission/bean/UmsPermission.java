package com.rystars.mall.admin.ums.permission.bean;

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
import java.util.Date;

/**
 * 【ums_permission(后台用户权限表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:59:13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_permission")
@Schema(description = "ums_permission(后台用户权限表)")
public class UmsPermission extends BaseBean<UmsPermission> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "父级权限id")
    private Long pid;

    @Schema(description = "名称")
    private String name;

    @Schema(description = "权限值")
    private String value;

    @Schema(description = "图标")
    private String icon;

    @Schema(description = "权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    @Schema(description = "前端资源路径")
    private String uri;

    @Schema(description = "启用状态；0->禁用；1->启用")
    private Integer status;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "排序")
    private Integer sort;

}




