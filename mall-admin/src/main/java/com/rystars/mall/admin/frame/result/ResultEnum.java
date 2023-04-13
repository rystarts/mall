package com.rystars.mall.admin.frame.result;

/**
 * @author rystars
 * @date 2023/4/12
 */
public enum ResultEnum implements IResult {

    /**
     * 接口调用成功
     */
    SUCCESS(201, "接口调用成功"),

    /**
     * 接口调用失败
     */
    FAILED(202, "接口调用失败"),

    /**
     * 参数校验失败
     */
    VALIDATE_FAILED(203, "参数校验失败"),

    /**
     * 没有权限访问资源
     */
    AUTH_FAILED(204, "没有权限访问资源");

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
