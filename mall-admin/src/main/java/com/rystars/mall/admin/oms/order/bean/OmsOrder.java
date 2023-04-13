package com.rystars.mall.admin.oms.order.bean;

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
 * 【oms_order(订单表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:43:37
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "oms_order")
@Schema(description = "oms_order(订单表)")
public class OmsOrder extends BaseBean<OmsOrder> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "订单id")
    private Long id;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "couponId")
    private Long couponId;

    @Schema(description = "订单编号")
    private String orderSn;

    @Schema(description = "提交时间")
    private Date createTime;

    @Schema(description = "用户帐号")
    private String memberUsername;

    @Schema(description = "订单总金额")
    private BigDecimal totalAmount;

    @Schema(description = "应付金额（实际支付金额）")
    private BigDecimal payAmount;

    @Schema(description = "运费金额")
    private BigDecimal freightAmount;

    @Schema(description = "促销优化金额（促销价、满减、阶梯价）")
    private BigDecimal promotionAmount;

    @Schema(description = "积分抵扣金额")
    private BigDecimal integrationAmount;

    @Schema(description = "优惠券抵扣金额")
    private BigDecimal couponAmount;

    @Schema(description = "管理员后台调整订单使用的折扣金额")
    private BigDecimal discountAmount;

    @Schema(description = "支付方式：0->未支付；1->支付宝；2->微信")
    private Integer payType;

    @Schema(description = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;

    @Schema(description = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;

    @Schema(description = "订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;

    @Schema(description = "物流公司(配送方式)")
    private String deliveryCompany;

    @Schema(description = "物流单号")
    private String deliverySn;

    @Schema(description = "自动确认时间（天）")
    private Integer autoConfirmDay;

    @Schema(description = "可以获得的积分")
    private Integer integration;

    @Schema(description = "可以活动的成长值")
    private Integer growth;

    @Schema(description = "活动信息")
    private String promotionInfo;

    @Schema(description = "发票类型：0->不开发票；1->电子发票；2->纸质发票")
    private Integer billType;

    @Schema(description = "发票抬头")
    private String billHeader;

    @Schema(description = "发票内容")
    private String billContent;

    @Schema(description = "收票人电话")
    private String billReceiverPhone;

    @Schema(description = "收票人邮箱")
    private String billReceiverEmail;

    @Schema(description = "收货人姓名")
    private String receiverName;

    @Schema(description = "收货人电话")
    private String receiverPhone;

    @Schema(description = "收货人邮编")
    private String receiverPostCode;

    @Schema(description = "省份/直辖市")
    private String receiverProvince;

    @Schema(description = "城市")
    private String receiverCity;

    @Schema(description = "区")
    private String receiverRegion;

    @Schema(description = "详细地址")
    private String receiverDetailAddress;

    @Schema(description = "订单备注")
    private String note;

    @Schema(description = "确认收货状态：0->未确认；1->已确认")
    private Integer confirmStatus;

    @Schema(description = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    @Schema(description = "下单时使用的积分")
    private Integer useIntegration;

    @Schema(description = "支付时间")
    private Date paymentTime;

    @Schema(description = "发货时间")
    private Date deliveryTime;

    @Schema(description = "确认收货时间")
    private Date receiveTime;

    @Schema(description = "评价时间")
    private Date commentTime;

    @Schema(description = "修改时间")
    private Date modifyTime;

}




