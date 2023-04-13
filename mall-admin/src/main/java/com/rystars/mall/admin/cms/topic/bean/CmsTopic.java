package com.rystars.mall.admin.cms.topic.bean;

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
 * 【cms_topic(话题表)】Bean
 * @author rystars
 * @date 2023-04-13 10:39:19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="cms_topic")
@Schema(description = "cms_topic(话题表)")
public class CmsTopic extends BaseBean<CmsTopic> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "categoryId")
    private Long categoryId;
    
    @Schema(description = "name")
    private String name;
    
    @Schema(description = "createTime")
    private Date createTime;
    
    @Schema(description = "startTime")
    private Date startTime;
    
    @Schema(description = "endTime")
    private Date endTime;
    
    @Schema(description = "参与人数")
    private Integer attendCount;
    
    @Schema(description = "关注人数")
    private Integer attentionCount;
    
    @Schema(description = "readCount")
    private Integer readCount;
    
    @Schema(description = "奖品名称")
    private String awardName;
    
    @Schema(description = "参与方式")
    private String attendType;
    
    @Schema(description = "话题内容")
    private String content;

}




