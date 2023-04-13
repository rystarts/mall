package com.rystars.mall.admin.pms.album.bean;

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
 * 【pms_album(相册表)】Bean
 * @author rystars
 * @date 2023-04-13 10:49:58
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_album")
@Schema(description = "pms_album(相册表)")
public class PmsAlbum extends BaseBean<PmsAlbum> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "name")
    private String name;
    
    @Schema(description = "coverPic")
    private String coverPic;
    
    @Schema(description = "picCount")
    private Integer picCount;
    
    @Schema(description = "sort")
    private Integer sort;
    
    @Schema(description = "description")
    private String description;

}




