package com.rystars.mall.admin.cms.topic.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【cms_topic_comment(专题评论表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:10:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_topic_comment")
@Schema(description = "cms_topic_comment(专题评论表)")
public class CmsTopicComment extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "memberNickName")
    private String memberNickName;

    @Schema(description = "topicId")
    private Long topicId;

    @Schema(description = "memberIcon")
    private String memberIcon;

    @Schema(description = "content")
    private String content;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "showStatus")
    private Integer showStatus;

}




