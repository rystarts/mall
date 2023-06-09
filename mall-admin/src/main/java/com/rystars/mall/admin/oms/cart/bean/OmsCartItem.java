package com.rystars.mall.admin.oms.cart.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 【oms_cart_item(购物车表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:10:21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "oms_cart_item")
@Schema(description = "oms_cart_item(购物车表)")
public class OmsCartItem extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "productSkuId")
    private Long productSkuId;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "购买数量")
    private Integer quantity;

    @Schema(description = "添加到购物车的价格")
    private BigDecimal price;

    @Schema(description = "商品主图")
    private String productPic;

    @Schema(description = "商品名称")
    private String productName;

    @Schema(description = "商品副标题（卖点）")
    private String productSubTitle;

    @Schema(description = "商品sku条码")
    private String productSkuCode;

    @Schema(description = "会员昵称")
    private String memberNickname;

    @Schema(description = "创建时间")
    private Date createDate;

    @Schema(description = "修改时间")
    private Date modifyDate;

    @Schema(description = "是否删除")
    private Integer deleteStatus;

    @Schema(description = "商品分类")
    private Long productCategoryId;

    @Schema(description = "productBrand")
    private String productBrand;

    @Schema(description = "productSn")
    private String productSn;

    @Schema(description = "商品销售属性:[{\"key\":\"颜色\",\"value\":\"颜色\"},{\"key\":\"容量\",\"value\":\"4G\"}]")
    private String productAttr;

}




