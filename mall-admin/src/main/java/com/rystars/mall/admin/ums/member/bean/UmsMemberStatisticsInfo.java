package com.rystars.mall.admin.ums.member.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【ums_member_statistics_info(会员统计信息)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_member_statistics_info")
@Schema(description = "ums_member_statistics_info(会员统计信息)")
public class UmsMemberStatisticsInfo extends BaseBean<UmsMemberStatisticsInfo> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "累计消费金额")
    private BigDecimal consumeAmount;

    @Schema(description = "订单数量")
    private Integer orderCount;

    @Schema(description = "优惠券数量")
    private Integer couponCount;

    @Schema(description = "评价数")
    private Integer commentCount;

    @Schema(description = "退货数量")
    private Integer returnOrderCount;

    @Schema(description = "登录次数")
    private Integer loginCount;

    @Schema(description = "关注数量")
    private Integer attendCount;

    @Schema(description = "粉丝数量")
    private Integer fansCount;

    @Schema(description = "collectProductCount")
    private Integer collectProductCount;

    @Schema(description = "collectSubjectCount")
    private Integer collectSubjectCount;

    @Schema(description = "collectTopicCount")
    private Integer collectTopicCount;

    @Schema(description = "collectCommentCount")
    private Integer collectCommentCount;

    @Schema(description = "inviteFriendCount")
    private Integer inviteFriendCount;

    @Schema(description = "最后一次下订单时间")
    private Date recentOrderTime;

}




