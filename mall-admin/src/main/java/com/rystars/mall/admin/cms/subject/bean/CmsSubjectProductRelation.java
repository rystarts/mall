package com.rystars.mall.admin.cms.subject.bean;

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
 * 【cms_subject_product_relation(专题商品关系表)】Bean
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="cms_subject_product_relation")
@Schema(description = "cms_subject_product_relation(专题商品关系表)")
public class CmsSubjectProductRelation extends BaseBean<CmsSubjectProductRelation> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "subjectId")
    private Long subjectId;
    
    @Schema(description = "productId")
    private Long productId;

}




