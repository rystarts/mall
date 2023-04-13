package com.rystars.mall.admin.pms.sku.bean;

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
 * 【pms_sku_stock(sku的库存)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:51:06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_sku_stock")
@Schema(description = "pms_sku_stock(sku的库存)")
public class PmsSkuStock extends BaseBean<PmsSkuStock> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "sku编码")
    private String skuCode;

    @Schema(description = "price")
    private BigDecimal price;

    @Schema(description = "库存")
    private Integer stock;

    @Schema(description = "预警库存")
    private Integer lowStock;

    @Schema(description = "展示图片")
    private String pic;

    @Schema(description = "销量")
    private Integer sale;

    @Schema(description = "单品促销价格")
    private BigDecimal promotionPrice;

    @Schema(description = "锁定库存")
    private Integer lockStock;

    @Schema(description = "商品销售属性，json格式")
    private String spData;

}




