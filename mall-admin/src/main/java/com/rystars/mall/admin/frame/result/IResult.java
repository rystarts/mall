package com.rystars.mall.admin.frame.result;

/**
 * @author rystars
 * @date 2023/4/12
 */
public interface IResult {

    /**
     * 获取响应码
     *
     * @return 响应码
     */
    Integer getCode();

    /**
     * 获取响应信息
     *
     * @return 响应信息
     */
    String getMessage();

}
