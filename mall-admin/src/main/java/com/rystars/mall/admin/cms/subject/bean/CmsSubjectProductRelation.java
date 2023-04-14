package com.rystars.mall.admin.cms.subject.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【cms_subject_product_relation(专题商品关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_subject_product_relation")
@Schema(description = "cms_subject_product_relation(专题商品关系表)")
public class CmsSubjectProductRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "subjectId")
    private Long subjectId;

    @Schema(description = "productId")
    private Long productId;

}




