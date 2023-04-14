package com.rystars.mall.admin.oms.order.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 【oms_order_item(订单中所包含的商品)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "oms_order_item")
@Schema(description = "oms_order_item(订单中所包含的商品)")
public class OmsOrderItem extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "订单id")
    private Long orderId;

    @Schema(description = "订单编号")
    private String orderSn;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "productPic")
    private String productPic;

    @Schema(description = "productName")
    private String productName;

    @Schema(description = "productBrand")
    private String productBrand;

    @Schema(description = "productSn")
    private String productSn;

    @Schema(description = "销售价格")
    private BigDecimal productPrice;

    @Schema(description = "购买数量")
    private Integer productQuantity;

    @Schema(description = "商品sku编号")
    private Long productSkuId;

    @Schema(description = "商品sku条码")
    private String productSkuCode;

    @Schema(description = "商品分类id")
    private Long productCategoryId;

    @Schema(description = "商品促销名称")
    private String promotionName;

    @Schema(description = "商品促销分解金额")
    private BigDecimal promotionAmount;

    @Schema(description = "优惠券优惠分解金额")
    private BigDecimal couponAmount;

    @Schema(description = "积分优惠分解金额")
    private BigDecimal integrationAmount;

    @Schema(description = "该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    @Schema(description = "giftIntegration")
    private Integer giftIntegration;

    @Schema(description = "giftGrowth")
    private Integer giftGrowth;

    @Schema(description = "商品销售属性:[{\"key\":\"颜色\",\"value\":\"颜色\"},{\"key\":\"容量\",\"value\":\"4G\"}]")
    private String productAttr;

}




