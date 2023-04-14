package com.rystars.mall.admin.sms.coupon.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【sms_coupon_product_relation(优惠券和产品的关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:50
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_coupon_product_relation")
@Schema(description = "sms_coupon_product_relation(优惠券和产品的关系表)")
public class SmsCouponProductRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "couponId")
    private Long couponId;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "商品名称")
    private String productName;

    @Schema(description = "商品编码")
    private String productSn;

}




