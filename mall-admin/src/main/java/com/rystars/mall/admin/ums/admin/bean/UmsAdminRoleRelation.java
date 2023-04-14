package com.rystars.mall.admin.ums.admin.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【ums_admin_role_relation(后台用户和角色关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_admin_role_relation")
@Schema(description = "ums_admin_role_relation(后台用户和角色关系表)")
public class UmsAdminRoleRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "adminId")
    private Long adminId;

    @Schema(description = "roleId")
    private Long roleId;

}




