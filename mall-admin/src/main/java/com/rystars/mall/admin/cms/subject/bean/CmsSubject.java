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
 * 【cms_subject(专题表)】Bean
 * @author rystars
 * @date 2023-04-13 10:39:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="cms_subject")
@Schema(description = "cms_subject(专题表)")
public class CmsSubject extends BaseBean<CmsSubject> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "categoryId")
    private Long categoryId;
    
    @Schema(description = "title")
    private String title;
    
    @Schema(description = "专题主图")
    private String pic;
    
    @Schema(description = "关联产品数量")
    private Integer productCount;
    
    @Schema(description = "recommendStatus")
    private Integer recommendStatus;
    
    @Schema(description = "createTime")
    private Date createTime;
    
    @Schema(description = "collectCount")
    private Integer collectCount;
    
    @Schema(description = "readCount")
    private Integer readCount;
    
    @Schema(description = "commentCount")
    private Integer commentCount;
    
    @Schema(description = "画册图片用逗号分割")
    private String albumPics;
    
    @Schema(description = "description")
    private String description;
    
    @Schema(description = "显示状态：0->不显示；1->显示")
    private Integer showStatus;
    
    @Schema(description = "content")
    private String content;
    
    @Schema(description = "转发数")
    private Integer forwardCount;
    
    @Schema(description = "专题分类名称")
    private String categoryName;

}




