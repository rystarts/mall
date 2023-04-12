package com.rystars.mall.admin.frame.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rystars
 * @date 2023/4/12
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    public static <T> Result<T> success(T data) {
        return new Result<>(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(ResultEnum.SUCCESS.getCode(), message, data);
    }

    public static <T> Result<T> failed() {
        return new Result<>(ResultEnum.FAILED.getCode(), ResultEnum.FAILED.getMessage(), null);
    }

    public static <T> Result<T> failed(String message) {
        return new Result<>(ResultEnum.FAILED.getCode(), message, null);
    }

    public static <T> Result<T> failed(IResult errorResult) {
        return new Result<>(errorResult.getCode(), errorResult.getMessage(), null);
    }

    public static <T> Result<T> instance(boolean success) {
        if (success) {
            return success(null);
        } else {
            return failed();
        }
    }

    public static <T> Result<T> instance(boolean success, T data) {
        if (success) {
            return success(data);
        } else {
            return failed();
        }
    }

    public static <T> Result<T> instance(boolean success, String message, T data) {
        if (success) {
            return success(message, data);
        } else {
            return failed(message);
        }
    }

    public static <T> Result<T> instance(Integer code, String message, T data) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

}
