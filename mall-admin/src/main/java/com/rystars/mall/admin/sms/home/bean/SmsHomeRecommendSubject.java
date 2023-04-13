package com.rystars.mall.admin.sms.home.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * 【sms_home_recommend_subject(首页推荐专题表)】Bean
 *
 * @author rystars
 * @date 2023-04-13 10:54:46
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "sms_home_recommend_subject")
@Schema(description = "sms_home_recommend_subject(首页推荐专题表)")
public class SmsHomeRecommendSubject extends BaseBean<SmsHomeRecommendSubject> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "subjectId")
    private Long subjectId;

    @Schema(description = "subjectName")
    private String subjectName;

    @Schema(description = "recommendStatus")
    private Integer recommendStatus;

    @Schema(description = "sort")
    private Integer sort;

}




