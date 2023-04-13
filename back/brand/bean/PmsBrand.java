package com.rystars.mall.admin.pms.brand.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.rystars.mall.admin.frame.base.bean.BaseBean;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author rystars
 * @date 2023/4/12
 * 商品品牌
 */

@Data
@Schema(description = "商品品牌信息")
@EqualsAndHashCode(callSuper = true)
public class PmsBrand extends BaseBean<PmsBrand> implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    private Long id;
    @Schema(description = "名称")
    private String name;
    @Schema(description = "首字母")
    private String firstLetter;
    @Schema(description = "排序")
    private Integer sort;
    @Schema(description = "是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;
    @Schema(description = "是否显示")
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
