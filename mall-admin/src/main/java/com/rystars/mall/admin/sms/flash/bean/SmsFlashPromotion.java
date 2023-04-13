package com.rystars.mall.admin.sms.flash.bean;

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
import java.util.Date;

/**
 * 【sms_flash_promotion(限时购表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_flash_promotion")
@Schema(description = "sms_flash_promotion(限时购表)")
public class SmsFlashPromotion extends BaseBean<SmsFlashPromotion> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "秒杀时间段名称")
    private String title;

    @Schema(description = "开始日期")
    private Date startDate;

    @Schema(description = "结束日期")
    private Date endDate;

    @Schema(description = "上下线状态")
    private Integer status;

    @Schema(description = "创建时间")
    private Date createTime;

}




