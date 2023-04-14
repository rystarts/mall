package com.rystars.mall.admin.pms.feight.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 【pms_feight_template(运费模版)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_feight_template")
@Schema(description = "pms_feight_template(运费模版)")
public class PmsFeightTemplate extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "name")
    private String name;

    @Schema(description = "计费类型:0->按重量；1->按件数")
    private Integer chargeType;

    @Schema(description = "首重kg")
    private BigDecimal firstWeight;

    @Schema(description = "首费（元）")
    private BigDecimal firstFee;

    @Schema(description = "continueWeight")
    private BigDecimal continueWeight;

    @Schema(description = "continmeFee")
    private BigDecimal continmeFee;

    @Schema(description = "目的地（省、市）")
    private String dest;

}




