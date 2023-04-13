package com.rystars.mall.admin.pms.product.bean;

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
 * 【pms_product_vertify_record(商品审核记录)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:57
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_product_vertify_record")
@Schema(description = "pms_product_vertify_record(商品审核记录)")
public class PmsProductVertifyRecord extends BaseBean<PmsProductVertifyRecord> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "productId")
    private Long productId;
    
    @Schema(description = "createTime")
    private Date createTime;
    
    @Schema(description = "审核人")
    private String vertifyMan;
    
    @Schema(description = "status")
    private Integer status;
    
    @Schema(description = "反馈详情")
    private String detail;

}




