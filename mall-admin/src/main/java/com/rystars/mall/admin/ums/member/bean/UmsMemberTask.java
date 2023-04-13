package com.rystars.mall.admin.ums.member.bean;

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
 * 【ums_member_task(会员任务表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:52
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_member_task")
@Schema(description = "ums_member_task(会员任务表)")
public class UmsMemberTask extends BaseBean<UmsMemberTask> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "name")
    private String name;
    
    @Schema(description = "赠送成长值")
    private Integer growth;
    
    @Schema(description = "赠送积分")
    private Integer intergration;
    
    @Schema(description = "任务类型：0->新手任务；1->日常任务")
    private Integer type;

}




