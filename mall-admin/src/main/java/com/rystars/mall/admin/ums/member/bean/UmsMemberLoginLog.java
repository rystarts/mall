package com.rystars.mall.admin.ums.member.bean;

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
 * 【ums_member_login_log(会员登录记录)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_member_login_log")
@Schema(description = "ums_member_login_log(会员登录记录)")
public class UmsMemberLoginLog extends BaseBean<UmsMemberLoginLog> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "ip")
    private String ip;

    @Schema(description = "city")
    private String city;

    @Schema(description = "登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

    @Schema(description = "province")
    private String province;

}




