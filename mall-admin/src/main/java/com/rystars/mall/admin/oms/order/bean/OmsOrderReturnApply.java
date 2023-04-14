package com.rystars.mall.admin.oms.order.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 【oms_order_return_apply(订单退货申请)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "oms_order_return_apply")
@Schema(description = "oms_order_return_apply(订单退货申请)")
public class OmsOrderReturnApply extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "订单id")
    private Long orderId;

    @Schema(description = "收货地址表id")
    private Long companyAddressId;

    @Schema(description = "退货商品id")
    private Long productId;

    @Schema(description = "订单编号")
    private String orderSn;

    @Schema(description = "申请时间")
    private Date createTime;

    @Schema(description = "会员用户名")
    private String memberUsername;

    @Schema(description = "退款金额")
    private BigDecimal returnAmount;

    @Schema(description = "退货人姓名")
    private String returnName;

    @Schema(description = "退货人电话")
    private String returnPhone;

    @Schema(description = "申请状态：0->待处理；1->退货中；2->已完成；3->已拒绝")
    private Integer status;

    @Schema(description = "处理时间")
    private Date handleTime;

    @Schema(description = "商品图片")
    private String productPic;

    @Schema(description = "商品名称")
    private String productName;

    @Schema(description = "商品品牌")
    private String productBrand;

    @Schema(description = "商品销售属性：颜色：红色；尺码：xl;")
    private String productAttr;

    @Schema(description = "退货数量")
    private Integer productCount;

    @Schema(description = "商品单价")
    private BigDecimal productPrice;

    @Schema(description = "商品实际支付单价")
    private BigDecimal productRealPrice;

    @Schema(description = "原因")
    private String reason;

    @Schema(description = "描述")
    private String description;

    @Schema(description = "凭证图片，以逗号隔开")
    private String proofPics;

    @Schema(description = "处理备注")
    private String handleNote;

    @Schema(description = "处理人员")
    private String handleMan;

    @Schema(description = "收货人")
    private String receiveMan;

    @Schema(description = "收货时间")
    private Date receiveTime;

    @Schema(description = "收货备注")
    private String receiveNote;

}




