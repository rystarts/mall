package com.rystars.mall.admin.cms.help.bean;

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
 * 【cms_help(帮助表)】Bean
 * @author rystars
 * @date 2023-04-13 10:38:18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="cms_help")
@Schema(description = "cms_help(帮助表)")
public class CmsHelp extends BaseBean<CmsHelp> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
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




