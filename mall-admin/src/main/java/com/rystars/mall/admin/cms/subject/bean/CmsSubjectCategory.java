package com.rystars.mall.admin.cms.subject.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【cms_subject_category(专题分类表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:10:02
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_subject_category")
@Schema(description = "cms_subject_category(专题分类表)")
public class CmsSubjectCategory extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "name")
    private String name;

    @Schema(description = "分类图标")
    private String icon;

    @Schema(description = "专题数量")
    private Integer subjectCount;

    @Schema(description = "showStatus")
    private Integer showStatus;

    @Schema(description = "sort")
    private Integer sort;

}




