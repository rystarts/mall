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
 * 【ums_member_rule_setting(会员积分成长规则表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_member_rule_setting")
@Schema(description = "ums_member_rule_setting(会员积分成长规则表)")
public class UmsMemberRuleSetting extends BaseBean<UmsMemberRuleSetting> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "连续签到天数")
    private Integer continueSignDay;
    
    @Schema(description = "连续签到赠送数量")
    private Integer continueSignPoint;
    
    @Schema(description = "每消费多少元获取1个点")
    private BigDecimal consumePerPoint;
    
    @Schema(description = "最低获取点数的订单金额")
    private BigDecimal lowOrderAmount;
    
    @Schema(description = "每笔订单最高获取点数")
    private Integer maxPointPerOrder;
    
    @Schema(description = "类型：0->积分规则；1->成长值规则")
    private Integer type;

}




