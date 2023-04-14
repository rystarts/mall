package com.rystars.mall.admin.pms.member.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 【pms_member_price(商品会员价格表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:11:20
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "pms_member_price")
@Schema(description = "pms_member_price(商品会员价格表)")
public class PmsMemberPrice extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "productId")
    private Long productId;

    @Schema(description = "memberLevelId")
    private Long memberLevelId;

    @Schema(description = "会员价格")
    private BigDecimal memberPrice;

    @Schema(description = "memberLevelName")
    private String memberLevelName;

}




