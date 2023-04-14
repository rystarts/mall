package com.rystars.mall.admin.oms.order.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【oms_order_operate_history(订单操作历史记录)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:10:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "oms_order_operate_history")
@Schema(description = "oms_order_operate_history(订单操作历史记录)")
public class OmsOrderOperateHistory extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "订单id")
    private Long orderId;

    @Schema(description = "操作人：用户；系统；后台管理员")
    private String operateMan;

    @Schema(description = "操作时间")
    private Date createTime;

    @Schema(description = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer orderStatus;

    @Schema(description = "备注")
    private String note;

}




