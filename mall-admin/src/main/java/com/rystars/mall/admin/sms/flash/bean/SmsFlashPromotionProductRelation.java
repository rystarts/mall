package com.rystars.mall.admin.sms.flash.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 【sms_flash_promotion_product_relation(商品限时购与商品关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_flash_promotion_product_relation")
@Schema(description = "sms_flash_promotion_product_relation(商品限时购与商品关系表)")
public class SmsFlashPromotionProductRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "编号")
    private Long id;

    @Schema(description = "flashPromotionId")
    private Long flashPromotionId;

    @Schema(description = "编号")
    private Long flashPromotionSessionId;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "限时购价格")
    private BigDecimal flashPromotionPrice;

    @Schema(description = "限时购数量")
    private Integer flashPromotionCount;

    @Schema(description = "每人限购数量")
    private Integer flashPromotionLimit;

    @Schema(description = "排序")
    private Integer sort;

}




