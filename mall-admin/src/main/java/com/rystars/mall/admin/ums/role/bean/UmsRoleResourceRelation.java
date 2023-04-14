package com.rystars.mall.admin.ums.role.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【ums_role_resource_relation(后台角色资源关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:13:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_role_resource_relation")
@Schema(description = "ums_role_resource_relation(后台角色资源关系表)")
public class UmsRoleResourceRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "角色ID")
    private Long roleId;

    @Schema(description = "资源ID")
    private Long resourceId;

}




