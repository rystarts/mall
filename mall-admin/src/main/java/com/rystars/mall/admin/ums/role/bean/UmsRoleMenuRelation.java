package com.rystars.mall.admin.ums.role.bean;

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
 * 【ums_role_menu_relation(后台角色菜单关系表)】Bean
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_role_menu_relation")
@Schema(description = "ums_role_menu_relation(后台角色菜单关系表)")
public class UmsRoleMenuRelation extends BaseBean<UmsRoleMenuRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "角色ID")
    private Long roleId;
    
    @Schema(description = "菜单ID")
    private Long menuId;

}




