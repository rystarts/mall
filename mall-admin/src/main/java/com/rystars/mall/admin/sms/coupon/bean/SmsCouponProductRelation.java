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

/**
 * 【sms_coupon_product_relation(优惠券和产品的关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_coupon_product_relation")
@Schema(description = "sms_coupon_product_relation(优惠券和产品的关系表)")
public class SmsCouponProductRelation extends BaseBean<SmsCouponProductRelation> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

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




