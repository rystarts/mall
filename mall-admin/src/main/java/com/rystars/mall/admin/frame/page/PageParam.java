package com.rystars.mall.admin.frame.page;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @author rystars
 * @date 2023/4/12
 */
@Data
@Accessors(chain = true)
public class PageParam {

    /**
     * 当前页码
     */
    private Long current = 1L;

    /**
     * 每页大小
     */
    private Long size = 10L;

    /**
     * 参数
     */
    private Map<String, Object> params;

    /**
     * 排序
     */
    private Map<String, String> orders;


}
