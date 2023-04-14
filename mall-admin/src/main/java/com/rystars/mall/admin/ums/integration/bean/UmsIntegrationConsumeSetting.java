package com.rystars.mall.admin.ums.integration.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【ums_integration_consume_setting(积分消费设置)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_integration_consume_setting")
@Schema(description = "ums_integration_consume_setting(积分消费设置)")
public class UmsIntegrationConsumeSetting extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "每一元需要抵扣的积分数量")
    private Integer deductionPerAmount;

    @Schema(description = "每笔订单最高抵用百分比")
    private Integer maxPercentPerOrder;

    @Schema(description = "每次使用积分最小单位100")
    private Integer useUnit;

    @Schema(description = "是否可以和优惠券同用；0->不可以；1->可以")
    private Integer couponStatus;

}




