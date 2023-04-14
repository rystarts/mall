package com.rystars.mall.admin.ums.resource.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 【ums_resource_category(资源分类表)】Bean
 *
 * @author rystars
 * @date 2023-04-14 17:13:22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value = "ums_resource_category")
@Schema(description = "ums_resource_category(资源分类表)")
public class UmsResourceCategory extends BaseBean {

    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Long id;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "分类名称")
    private String name;

    @Schema(description = "排序")
    private Integer sort;

}




