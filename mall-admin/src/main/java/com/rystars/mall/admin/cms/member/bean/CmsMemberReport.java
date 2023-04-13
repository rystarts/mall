package com.rystars.mall.admin.cms.member.bean;

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
import java.util.Date;

/**
 * 【cms_member_report(用户举报表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:38:40
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_member_report")
@Schema(description = "cms_member_report(用户举报表)")
public class CmsMemberReport extends BaseBean<CmsMemberReport> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer reportType;

    @Schema(description = "举报人")
    private String reportMemberName;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "reportObject")
    private String reportObject;

    @Schema(description = "举报状态：0->未处理；1->已处理")
    private Integer reportStatus;

    @Schema(description = "处理结果：0->无效；1->有效；2->恶意")
    private Integer handleStatus;

    @Schema(description = "note")
    private String note;

}




