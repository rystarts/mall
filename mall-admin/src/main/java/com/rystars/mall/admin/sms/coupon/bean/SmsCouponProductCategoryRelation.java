package com.rystars.mall.admin.sms.coupon.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【sms_coupon_product_category_relation(优惠券和产品分类关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:50
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_coupon_product_category_relation")
@Schema(description = "sms_coupon_product_category_relation(优惠券和产品分类关系表)")
public class SmsCouponProductCategoryRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "couponId")
    private Long couponId;

    @Schema(description = "productCategoryId")
    private Long productCategoryId;

    @Schema(description = "产品分类名称")
    private String productCategoryName;

    @Schema(description = "父分类名称")
    private String parentCategoryName;

}




