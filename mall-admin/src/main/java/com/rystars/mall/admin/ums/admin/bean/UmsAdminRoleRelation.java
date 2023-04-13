package com.rystars.mall.admin.ums.admin.bean;

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
 * 【ums_admin_role_relation(后台用户和角色关系表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_admin_role_relation")
@Schema(description = "ums_admin_role_relation(后台用户和角色关系表)")
public class UmsAdminRoleRelation extends BaseBean<UmsAdminRoleRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "adminId")
    private Long adminId;
    
    @Schema(description = "roleId")
    private Long roleId;

}




