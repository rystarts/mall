package com.rystars.mall.admin.pms.comment.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【pms_comment_replay(产品评价回复表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:05
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_comment_replay")
@Schema(description = "pms_comment_replay(产品评价回复表)")
public class PmsCommentReplay extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "commentId")
    private Long commentId;

    @Schema(description = "memberNickName")
    private String memberNickName;

    @Schema(description = "memberIcon")
    private String memberIcon;

    @Schema(description = "content")
    private String content;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "评论人员类型；0->会员；1->管理员")
    private Integer type;

}




