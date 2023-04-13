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
 * 【ums_member_level(会员等级表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_member_level")
@Schema(description = "ums_member_level(会员等级表)")
public class UmsMemberLevel extends BaseBean<UmsMemberLevel> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "name")
    private String name;
    
    @Schema(description = "growthPoint")
    private Integer growthPoint;
    
    @Schema(description = "是否为默认等级：0->不是；1->是")
    private Integer defaultStatus;
    
    @Schema(description = "免运费标准")
    private BigDecimal freeFreightPoint;
    
    @Schema(description = "每次评价获取的成长值")
    private Integer commentGrowthPoint;
    
    @Schema(description = "是否有免邮特权")
    private Integer priviledgeFreeFreight;
    
    @Schema(description = "是否有签到特权")
    private Integer priviledgeSignIn;
    
    @Schema(description = "是否有评论获奖励特权")
    private Integer priviledgeComment;
    
    @Schema(description = "是否有专享活动特权")
    private Integer priviledgePromotion;
    
    @Schema(description = "是否有会员价格特权")
    private Integer priviledgeMemberPrice;
    
    @Schema(description = "是否有生日特权")
    private Integer priviledgeBirthday;
    
    @Schema(description = "note")
    private String note;

}




