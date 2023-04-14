package com.rystars.mall.admin.sms.coupon.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【sms_coupon_history(优惠券使用、领取历史表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:50
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_coupon_history")
@Schema(description = "sms_coupon_history(优惠券使用、领取历史表)")
public class SmsCouponHistory extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "couponId")
    private Long couponId;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "couponCode")
    private String couponCode;

    @Schema(description = "领取人昵称")
    private String memberNickname;

    @Schema(description = "获取类型：0->后台赠送；1->主动获取")
    private Integer getType;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "使用状态：0->未使用；1->已使用；2->已过期")
    private Integer useStatus;

    @Schema(description = "使用时间")
    private Date useTime;

    @Schema(description = "订单编号")
    private Long orderId;

    @Schema(description = "订单号码")
    private String orderSn;

}




