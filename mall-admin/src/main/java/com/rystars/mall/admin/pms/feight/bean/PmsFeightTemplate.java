package com.rystars.mall.admin.pms.feight.bean;

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
 * 【pms_feight_template(运费模版)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:37
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_feight_template")
@Schema(description = "pms_feight_template(运费模版)")
public class PmsFeightTemplate extends BaseBean<PmsFeightTemplate> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
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




