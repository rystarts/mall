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
 * 【ums_admin(后台用户表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_admin")
@Schema(description = "ums_admin(后台用户表)")
public class UmsAdmin extends BaseBean<UmsAdmin> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "username")
    private String username;
    
    @Schema(description = "password")
    private String password;
    
    @Schema(description = "头像")
    private String icon;
    
    @Schema(description = "邮箱")
    private String email;
    
    @Schema(description = "昵称")
    private String nickName;
    
    @Schema(description = "备注信息")
    private String note;
    
    @Schema(description = "创建时间")
    private Date createTime;
    
    @Schema(description = "最后登录时间")
    private Date loginTime;
    
    @Schema(description = "帐号启用状态：0->禁用；1->启用")
    private Integer status;

}




