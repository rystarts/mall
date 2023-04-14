package com.rystars.mall.admin.sms.flash.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【sms_flash_promotion_log(限时购通知记录)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_flash_promotion_log")
@Schema(description = "sms_flash_promotion_log(限时购通知记录)")
public class SmsFlashPromotionLog extends BaseBean {

    @TableId(type = IdType.AUTO)
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




