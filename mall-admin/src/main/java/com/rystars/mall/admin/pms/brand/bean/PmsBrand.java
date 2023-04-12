package com.rystars.mall.admin.pms.brand.bean;

import lombok.Data;

/**
 * @author rystars
 * @date 2023/4/12
 * 商品品牌
 */

@Data
public class PmsBrand {

    private Long id;
    private String name;
    private String first_letter;
    private Integer sort;
    private Integer factoryStatus;
    private Integer showStatus;
    private Integer productCount;
    private Integer productCommentCount;
    private String logo;
    private String bigPic;
    private String brandStory;

}
