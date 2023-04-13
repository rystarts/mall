package com.rystars.mall.admin.oms.company.bean;

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
 * 【oms_company_address(公司收发货地址表)】Bean
 * @author rystars
 * @date 2023-04-13 10:43:28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="oms_company_address")
@Schema(description = "oms_company_address(公司收发货地址表)")
public class OmsCompanyAddress extends BaseBean<OmsCompanyAddress> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "地址名称")
    private String addressName;
    
    @Schema(description = "默认发货地址：0->否；1->是")
    private Integer sendStatus;
    
    @Schema(description = "是否默认收货地址：0->否；1->是")
    private Integer receiveStatus;
    
    @Schema(description = "收发货人姓名")
    private String name;
    
    @Schema(description = "收货人电话")
    private String phone;
    
    @Schema(description = "省/直辖市")
    private String province;
    
    @Schema(description = "市")
    private String city;
    
    @Schema(description = "区")
    private String region;
    
    @Schema(description = "详细地址")
    private String detailAddress;

}




