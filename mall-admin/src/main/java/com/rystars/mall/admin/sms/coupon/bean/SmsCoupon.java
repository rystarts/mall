package com.rystars.mall.admin.sms.coupon.bean;

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
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【sms_coupon(优惠券表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_coupon")
@Schema(description = "sms_coupon(优惠券表)")
public class SmsCoupon extends BaseBean<SmsCoupon> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    @Schema(description = "name")
    private String name;

    @Schema(description = "使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    @Schema(description = "数量")
    private Integer count;

    @Schema(description = "金额")
    private BigDecimal amount;

    @Schema(description = "每人限领张数")
    private Integer perLimit;

    @Schema(description = "使用门槛；0表示无门槛")
    private BigDecimal minPoint;

    @Schema(description = "startTime")
    private Date startTime;

    @Schema(description = "endTime")
    private Date endTime;

    @Schema(description = "使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer useType;

    @Schema(description = "备注")
    private String note;

    @Schema(description = "发行数量")
    private Integer publishCount;

    @Schema(description = "已使用数量")
    private Integer useCount;

    @Schema(description = "领取数量")
    private Integer receiveCount;

    @Schema(description = "可以领取的日期")
    private Date enableTime;

    @Schema(description = "优惠码")
    private String code;

    @Schema(description = "可领取的会员类型：0->无限时")
    private Integer memberLevel;

}




