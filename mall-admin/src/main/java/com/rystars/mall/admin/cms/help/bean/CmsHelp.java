package com.rystars.mall.admin.cms.help.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【cms_help(帮助表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:09:30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_help")
@Schema(description = "cms_help(帮助表)")
public class CmsHelp extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "categoryId")
    private Long categoryId;

    @Schema(description = "icon")
    private String icon;

    @Schema(description = "title")
    private String title;

    @Schema(description = "showStatus")
    private Integer showStatus;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "readCount")
    private Integer readCount;

    @Schema(description = "content")
    private String content;

}




