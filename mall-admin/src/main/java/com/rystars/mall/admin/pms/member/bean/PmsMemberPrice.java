package com.rystars.mall.admin.pms.member.bean;

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
 * 【pms_member_price(商品会员价格表)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:44
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_member_price")
@Schema(description = "pms_member_price(商品会员价格表)")
public class PmsMemberPrice extends BaseBean<PmsMemberPrice> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
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




