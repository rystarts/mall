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
 * 【pms_album_pic(画册图片表)】Bean
 * @author rystars
 * @date 2023-04-13 10:50:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName(value ="pms_album_pic")
@Schema(description = "pms_album_pic(画册图片表)")
public class PmsAlbumPic extends BaseBean<PmsAlbumPic> implements Serializable{

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type= IdType.AUTO)
    @Schema(description = "id")
    private Long id;
    
    @Schema(description = "albumId")
    private Long albumId;
    
    @Schema(description = "pic")
    private String pic;

}




