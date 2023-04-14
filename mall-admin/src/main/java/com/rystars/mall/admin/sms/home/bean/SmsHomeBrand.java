package com.rystars.mall.admin.sms.home.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【sms_home_brand(首页推荐品牌表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_home_brand")
@Schema(description = "sms_home_brand(首页推荐品牌表)")
public class SmsHomeBrand extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "brandId")
    private Long brandId;

    @Schema(description = "brandName")
    private String brandName;

    @Schema(description = "recommendStatus")
    private Integer recommendStatus;

    @Schema(description = "sort")
    private Integer sort;

}




