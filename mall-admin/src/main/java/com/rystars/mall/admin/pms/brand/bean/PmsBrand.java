package com.rystars.mall.admin.pms.brand.bean;

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
 * 【pms_brand(品牌表)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_brand")
@Schema(description = "pms_brand(品牌表)")
public class PmsBrand extends BaseBean<PmsBrand> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "name")
    private String name;
    
    @Schema(description = "首字母")
    private String firstLetter;
    
    @Schema(description = "sort")
    private Integer sort;
    
    @Schema(description = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;
    
    @Schema(description = "showStatus")
    private Integer showStatus;
    
    @Schema(description = "产品数量")
    private Integer productCount;
    
    @Schema(description = "产品评论数量")
    private Integer productCommentCount;
    
    @Schema(description = "品牌logo")
    private String logo;
    
    @Schema(description = "专区大图")
    private String bigPic;
    
    @Schema(description = "品牌故事")
    private String brandStory;

}




