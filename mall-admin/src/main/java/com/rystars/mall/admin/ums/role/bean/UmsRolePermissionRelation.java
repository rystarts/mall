package com.rystars.mall.admin.ums.role.bean;

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
 * 【ums_role_permission_relation(后台用户角色和权限关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_role_permission_relation")
@Schema(description = "ums_role_permission_relation(后台用户角色和权限关系表)")
public class UmsRolePermissionRelation extends BaseBean<UmsRolePermissionRelation> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "roleId")
    private Long roleId;

    @Schema(description = "permissionId")
    private Long permissionId;

}




