package com.rystars.mall.admin.pms.product.bean;

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
 * 【pms_product_operate_log】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:31
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_product_operate_log")
@Schema(description = "pms_product_operate_log")
public class PmsProductOperateLog extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "priceOld")
    private BigDecimal priceOld;

    @Schema(description = "priceNew")
    private BigDecimal priceNew;

    @Schema(description = "salePriceOld")
    private BigDecimal salePriceOld;

    @Schema(description = "salePriceNew")
    private BigDecimal salePriceNew;

    @Schema(description = "赠送的积分")
    private Integer giftPointOld;

    @Schema(description = "giftPointNew")
    private Integer giftPointNew;

    @Schema(description = "usePointLimitOld")
    private Integer usePointLimitOld;

    @Schema(description = "usePointLimitNew")
    private Integer usePointLimitNew;

    @Schema(description = "操作人")
    private String operateMan;

    @Schema(description = "createTime")
    private Date createTime;

}




