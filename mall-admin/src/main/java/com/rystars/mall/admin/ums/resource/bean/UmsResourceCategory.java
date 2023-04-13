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
 * 【ums_resource_category(资源分类表)】Bean
 * @author rystars
 * @date 2023-04-13 10:59:24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_resource_category")
@Schema(description = "ums_resource_category(资源分类表)")
public class UmsResourceCategory extends BaseBean<UmsResourceCategory> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "创建时间")
    private Date createTime;
    
    @Schema(description = "分类名称")
    private String name;
    
    @Schema(description = "排序")
    private Integer sort;

}




