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
 * 【ums_admin_login_log(后台用户登录日志表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_admin_login_log")
@Schema(description = "ums_admin_login_log(后台用户登录日志表)")
public class UmsAdminLoginLog extends BaseBean<UmsAdminLoginLog> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "adminId")
    private Long adminId;
    
    @Schema(description = "createTime")
    private Date createTime;
    
    @Schema(description = "ip")
    private String ip;
    
    @Schema(description = "address")
    private String address;
    
    @Schema(description = "浏览器登录类型")
    private String userAgent;

}



