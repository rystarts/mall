package com.rystars.mall.admin.ums.member.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_member_product_category_relation")
@Schema(description = "ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)")
public class UmsMemberProductCategoryRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "productCategoryId")
    private Long productCategoryId;

}




