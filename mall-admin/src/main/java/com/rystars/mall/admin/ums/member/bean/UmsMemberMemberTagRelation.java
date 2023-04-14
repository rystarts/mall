package com.rystars.mall.admin.ums.member.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【ums_member_member_tag_relation(用户和标签关系表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_member_member_tag_relation")
@Schema(description = "ums_member_member_tag_relation(用户和标签关系表)")
public class UmsMemberMemberTagRelation extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "memberId")
    private Long memberId;

    @Schema(description = "tagId")
    private Long tagId;

}




