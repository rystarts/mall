package com.rystars.mall.admin.sms.home.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【sms_home_advertise(首页轮播广告表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:12:10
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_home_advertise")
@Schema(description = "sms_home_advertise(首页轮播广告表)")
public class SmsHomeAdvertise extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "name")
    private String name;

    @Schema(description = "轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    @Schema(description = "pic")
    private String pic;

    @Schema(description = "startTime")
    private Date startTime;

    @Schema(description = "endTime")
    private Date endTime;

    @Schema(description = "上下线状态：0->下线；1->上线")
    private Integer status;

    @Schema(description = "点击数")
    private Integer clickCount;

    @Schema(description = "下单数")
    private Integer orderCount;

    @Schema(description = "链接地址")
    private String url;

    @Schema(description = "备注")
    private String note;

    @Schema(description = "排序")
    private Integer sort;

}




