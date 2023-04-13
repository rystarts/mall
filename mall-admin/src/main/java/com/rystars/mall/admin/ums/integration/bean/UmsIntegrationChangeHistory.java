package com.rystars.mall.admin.ums.integration.bean;

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
 * 【ums_integration_change_history(积分变化历史记录表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:39
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_integration_change_history")
@Schema(description = "ums_integration_change_history(积分变化历史记录表)")
public class UmsIntegrationChangeHistory extends BaseBean<UmsIntegrationChangeHistory> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "memberId")
    private Long memberId;
    
    @Schema(description = "createTime")
    private Date createTime;
    
    @Schema(description = "改变类型：0->增加；1->减少")
    private Integer changeType;
    
    @Schema(description = "积分改变数量")
    private Integer changeCount;
    
    @Schema(description = "操作人员")
    private String operateMan;
    
    @Schema(description = "操作备注")
    private String operateNote;
    
    @Schema(description = "积分来源：0->购物；1->管理员修改")
    private Integer sourceType;

}




