package com.rystars.mall.admin.ums.member.bean;

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
 * 【ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_member_product_category_relation")
@Schema(description = "ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)")
public class UmsMemberProductCategoryRelation extends BaseBean<UmsMemberProductCategoryRelation> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "productCategoryId")
    private Long productCategoryId;

}




