package com.rystars.mall.admin.ums.admin.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【ums_admin(后台用户表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_admin")
@Schema(description = "ums_admin(后台用户表)")
public class UmsAdmin extends BaseBean {

    @TableId(type = IdType.AUTO)
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




