package com.rystars.mall.admin.sms.coupon.bean;

import java.util.*;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.io.Serial;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.rystars.mall.admin.frame.base.bean.BaseBean;

/**
 * 【sms_coupon_product_category_relation(优惠券和产品分类关系表)】Bean
 * @author rystars
 * @date 2023-04-13 10:54:23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sms_coupon_product_category_relation")
@Schema(description = "sms_coupon_product_category_relation(优惠券和产品分类关系表)")
public class SmsCouponProductCategoryRelation extends BaseBean<SmsCouponProductCategoryRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
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




