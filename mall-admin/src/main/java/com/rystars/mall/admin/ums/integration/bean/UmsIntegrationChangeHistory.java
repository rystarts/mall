package com.rystars.mall.admin.ums.integration.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【ums_integration_change_history(积分变化历史记录表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:41
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_integration_change_history")
@Schema(description = "ums_integration_change_history(积分变化历史记录表)")
public class UmsIntegrationChangeHistory extends BaseBean {

    @TableId(type = IdType.AUTO)
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




