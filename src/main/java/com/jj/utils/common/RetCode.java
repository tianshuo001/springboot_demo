package com.jj.utils.common;

/**
 * @ClassName RetCode
 * @Description 状态码
 * @Author tianshuo
 * @Date 2021/3/16 18:28
 * @Version 1.0
 **/

public enum RetCode {

    //成功
    SUCCESS(0, "成功"),

    //失败
    FAIL(1, "查询失败");

    private int code;
    private String message;

    private RetCode(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
