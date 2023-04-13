package com.rystars.mall.admin.pms.product.bean;

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
import java.math.BigDecimal;

/**
 * 【pms_product_ladder(产品阶梯价格表(只针对同商品))】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_product_ladder")
@Schema(description = "pms_product_ladder(产品阶梯价格表(只针对同商品))")
public class PmsProductLadder extends BaseBean<PmsProductLadder> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "满足的商品数量")
    private Integer count;

    @Schema(description = "折扣")
    private BigDecimal discount;

    @Schema(description = "折后价格")
    private BigDecimal price;

}




