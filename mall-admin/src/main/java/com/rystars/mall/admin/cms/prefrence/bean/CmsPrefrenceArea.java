package com.rystars.mall.admin.cms.prefrence.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 【cms_prefrence_area(优选专区)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:09:53
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "cms_prefrence_area")
@Schema(description = "cms_prefrence_area(优选专区)")
public class CmsPrefrenceArea extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "name")
    private String name;

    @Schema(description = "subTitle")
    private String subTitle;

    @Schema(description = "sort")
    private Integer sort;

    @Schema(description = "showStatus")
    private Integer showStatus;

    @Schema(description = "展示图片")
    private byte[] pic;

}




