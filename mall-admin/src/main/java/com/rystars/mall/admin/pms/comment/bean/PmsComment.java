package com.rystars.mall.admin.pms.comment.bean;

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
 * 【pms_comment(商品评价表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:50:29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_comment")
@Schema(description = "pms_comment(商品评价表)")
public class PmsComment extends BaseBean<PmsComment> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "memberNickName")
    private String memberNickName;

    @Schema(description = "productName")
    private String productName;

    @Schema(description = "评价星数：0->5")
    private Integer star;

    @Schema(description = "评价的ip")
    private String memberIp;

    @Schema(description = "createTime")
    private Date createTime;

    @Schema(description = "showStatus")
    private Integer showStatus;

    @Schema(description = "购买时的商品属性")
    private String productAttribute;

    @Schema(description = "collectCouont")
    private Integer collectCouont;

    @Schema(description = "readCount")
    private Integer readCount;

    @Schema(description = "content")
    private String content;

    @Schema(description = "上传图片地址，以逗号隔开")
    private String pics;

    @Schema(description = "评论用户头像")
    private String memberIcon;

    @Schema(description = "replayCount")
    private Integer replayCount;

}




