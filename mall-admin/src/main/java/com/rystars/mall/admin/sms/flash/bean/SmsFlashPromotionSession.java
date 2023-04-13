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
 * 【sms_flash_promotion_session(限时购场次表)】Bean
 * @author rystars
 * @date 2023-04-13 10:54:34
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="sms_flash_promotion_session")
@Schema(description = "sms_flash_promotion_session(限时购场次表)")
public class SmsFlashPromotionSession extends BaseBean<SmsFlashPromotionSession> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "编号")
    private Long id;
    
    @Schema(description = "场次名称")
    private String name;
    
    @Schema(description = "每日开始时间")
    private Date startTime;
    
    @Schema(description = "每日结束时间")
    private Date endTime;
    
    @Schema(description = "启用状态：0->不启用；1->启用")
    private Integer status;
    
    @Schema(description = "创建时间")
    private Date createTime;

}




