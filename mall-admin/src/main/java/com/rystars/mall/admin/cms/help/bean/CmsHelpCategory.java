package com.rystars.mall.admin.cms.help.bean;

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
 * 【cms_help_category(帮助分类表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:38:18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_help_category")
@Schema(description = "cms_help_category(帮助分类表)")
public class CmsHelpCategory extends BaseBean<CmsHelpCategory> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "name")
    private String name;

    @Schema(description = "分类图标")
    private String icon;

    @Schema(description = "专题数量")
    private Integer helpCount;

    @Schema(description = "showStatus")
    private Integer showStatus;

    @Schema(description = "sort")
    private Integer sort;

}




