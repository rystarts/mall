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
import java.util.Date;

/**
 * 【pms_product(商品信息)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:50:56
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_product")
@Schema(description = "pms_product(商品信息)")
public class PmsProduct extends BaseBean<PmsProduct> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "brandId")
    private Long brandId;

    @Schema(description = "productCategoryId")
    private Long productCategoryId;

    @Schema(description = "feightTemplateId")
    private Long feightTemplateId;

    @Schema(description = "productAttributeCategoryId")
    private Long productAttributeCategoryId;

    @Schema(description = "name")
    private String name;

    @Schema(description = "pic")
    private String pic;

    @Schema(description = "货号")
    private String productSn;

    @Schema(description = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    @Schema(description = "上架状态：0->下架；1->上架")
    private Integer publishStatus;

    @Schema(description = "新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    @Schema(description = "推荐状态；0->不推荐；1->推荐")
    private Integer recommandStatus;

    @Schema(description = "审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    @Schema(description = "排序")
    private Integer sort;

    @Schema(description = "销量")
    private Integer sale;

    @Schema(description = "price")
    private BigDecimal price;

    @Schema(description = "促销价格")
    private BigDecimal promotionPrice;

    @Schema(description = "赠送的成长值")
    private Integer giftGrowth;

    @Schema(description = "赠送的积分")
    private Integer giftPoint;

    @Schema(description = "限制使用的积分数")
    private Integer usePointLimit;

    @Schema(description = "副标题")
    private String subTitle;

    @Schema(description = "商品描述")
    private String description;

    @Schema(description = "市场价")
    private BigDecimal originalPrice;

    @Schema(description = "库存")
    private Integer stock;

    @Schema(description = "库存预警值")
    private Integer lowStock;

    @Schema(description = "单位")
    private String unit;

    @Schema(description = "商品重量，默认为克")
    private BigDecimal weight;

    @Schema(description = "是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    @Schema(description = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    @Schema(description = "keywords")
    private String keywords;

    @Schema(description = "note")
    private String note;

    @Schema(description = "画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    @Schema(description = "detailTitle")
    private String detailTitle;

    @Schema(description = "detailDesc")
    private String detailDesc;

    @Schema(description = "产品详情网页内容")
    private String detailHtml;

    @Schema(description = "移动端网页详情")
    private String detailMobileHtml;

    @Schema(description = "促销开始时间")
    private Date promotionStartTime;

    @Schema(description = "促销结束时间")
    private Date promotionEndTime;

    @Schema(description = "活动限购数量")
    private Integer promotionPerLimit;

    @Schema(description = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    @Schema(description = "品牌名称")
    private String brandName;

    @Schema(description = "商品分类名称")
    private String productCategoryName;

}




