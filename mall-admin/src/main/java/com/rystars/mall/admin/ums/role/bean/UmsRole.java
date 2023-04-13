package com.rystars.mall.admin.ums.role.bean;

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
 * 【ums_role(后台用户角色表)】Bean
 * @author rystars
 * @date 2023-04-13 10:59:33
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_role")
@Schema(description = "ums_role(后台用户角色表)")
public class UmsRole extends BaseBean<UmsRole> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "名称")
    private String name;
    
    @Schema(description = "描述")
    private String description;
    
    @Schema(description = "后台用户数量")
    private Integer adminCount;
    
    @Schema(description = "创建时间")
    private Date createTime;
    
    @Schema(description = "启用状态：0->禁用；1->启用")
    private Integer status;
    
    @Schema(description = "sort")
    private Integer sort;

}




