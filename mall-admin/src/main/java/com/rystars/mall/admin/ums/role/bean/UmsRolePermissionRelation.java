package com.rystars.mall.admin.ums.role.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【ums_role_permission_relation(后台用户角色和权限关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:13:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_role_permission_relation")
@Schema(description = "ums_role_permission_relation(后台用户角色和权限关系表)")
public class UmsRolePermissionRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "roleId")
    private Long roleId;

    @Schema(description = "permissionId")
    private Long permissionId;

}




