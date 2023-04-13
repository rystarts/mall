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
import java.util.Date;

/**
 * 【oms_order_return_reason(退货原因表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:43:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "oms_order_return_reason")
@Schema(description = "oms_order_return_reason(退货原因表)")
public class OmsOrderReturnReason extends BaseBean<OmsOrderReturnReason> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "退货类型")
    private String name;

    @Schema(description = "sort")
    private Integer sort;

    @Schema(description = "状态：0->不启用；1->启用")
    private Integer status;

    @Schema(description = "添加时间")
    private Date createTime;

}




