package com.rystars.mall.admin.ums.resource.bean;

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
 * 【ums_resource(后台资源表)】Bean
 * @author rystars
 * @date 2023-04-13 10:59:24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_resource")
@Schema(description = "ums_resource(后台资源表)")
public class UmsResource extends BaseBean<UmsResource> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "创建时间")
    private Date createTime;
    
    @Schema(description = "资源名称")
    private String name;
    
    @Schema(description = "资源URL")
    private String url;
    
    @Schema(description = "描述")
    private String description;
    
    @Schema(description = "资源分类ID")
    private Long categoryId;

}




