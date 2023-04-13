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
 * 【ums_member_receive_address(会员收货地址表)】Bean
 * @author rystars
 * @date 2023-04-13 10:58:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="ums_member_receive_address")
@Schema(description = "ums_member_receive_address(会员收货地址表)")
public class UmsMemberReceiveAddress extends BaseBean<UmsMemberReceiveAddress> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "memberId")
    private Long memberId;
    
    @Schema(description = "收货人名称")
    private String name;
    
    @Schema(description = "phoneNumber")
    private String phoneNumber;
    
    @Schema(description = "是否为默认")
    private Integer defaultStatus;
    
    @Schema(description = "邮政编码")
    private String postCode;
    
    @Schema(description = "省份/直辖市")
    private String province;
    
    @Schema(description = "城市")
    private String city;
    
    @Schema(description = "区")
    private String region;
    
    @Schema(description = "详细地址(街道)")
    private String detailAddress;

}




