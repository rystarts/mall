package com.rystars.mall.admin.sms.flash.bean;

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
 * 【sms_flash_promotion_log(限时购通知记录)】Bean
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sms_flash_promotion_log")
@Schema(description = "sms_flash_promotion_log(限时购通知记录)")
public class SmsFlashPromotionLog extends BaseBean<SmsFlashPromotionLog> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Integer id;
    
    @Schema(description = "memberId")
    private Integer memberId;
    
    @Schema(description = "productId")
    private Long productId;
    
    @Schema(description = "memberPhone")
    private String memberPhone;
    
    @Schema(description = "productName")
    private String productName;
    
    @Schema(description = "会员订阅时间")
    private Date subscribeTime;
    
    @Schema(description = "sendTime")
    private Date sendTime;

}




