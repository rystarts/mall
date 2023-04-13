package com.rystars.mall.admin.ums.member.bean;

import java.util.*;
import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.io.Serial;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import com.rystars.mall.admin.frame.base.bean.BaseBean;

/**
 * 【ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_member_product_category_relation")
@Schema(description = "ums_member_product_category_relation(会员与产品分类关系表（用户喜欢的分类）)")
public class UmsMemberProductCategoryRelation extends BaseBean<UmsMemberProductCategoryRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "memberId")
    private Long memberId;
    
    @Schema(description = "productCategoryId")
    private Long productCategoryId;

}




