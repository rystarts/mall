package com.rystars.mall.admin.sms.home.bean;

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
 * 【sms_home_brand(首页推荐品牌表)】Bean
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sms_home_brand")
@Schema(description = "sms_home_brand(首页推荐品牌表)")
public class SmsHomeBrand extends BaseBean<SmsHomeBrand> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "brandId")
    private Long brandId;
    
    @Schema(description = "brandName")
    private String brandName;
    
    @Schema(description = "recommendStatus")
    private Integer recommendStatus;
    
    @Schema(description = "sort")
    private Integer sort;

}




