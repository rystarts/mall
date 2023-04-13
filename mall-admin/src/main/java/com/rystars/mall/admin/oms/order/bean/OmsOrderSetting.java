package com.rystars.mall.admin.oms.order.bean;

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

/**
 * 【oms_order_setting(订单设置表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "oms_order_setting")
@Schema(description = "oms_order_setting(订单设置表)")
public class OmsOrderSetting extends BaseBean<OmsOrderSetting> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "秒杀订单超时关闭时间(分)")
    private Integer flashOrderOvertime;

    @Schema(description = "正常订单超时时间(分)")
    private Integer normalOrderOvertime;

    @Schema(description = "发货后自动确认收货时间（天）")
    private Integer confirmOvertime;

    @Schema(description = "自动完成交易时间，不能申请售后（天）")
    private Integer finishOvertime;

    @Schema(description = "订单完成后自动好评时间（天）")
    private Integer commentOvertime;

}




