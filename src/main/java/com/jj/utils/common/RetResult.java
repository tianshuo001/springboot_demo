package com.jj.utils.common;

import java.util.ArrayList;

/**
 * @ClassName ReturnResult
 * @Description TODO
 * @Author tianshuo
 * @Date 2021/3/16 19:50
 * @Version 1.0
 **/
public class RetResult {
    private Integer code;
    private String msg;
    private Object data;

    /**
     * 返回状态吗、信息以及数据
     * **/
    public RetResult() {
        this.code = RetCode.SUCCESS.getCode();
        this.msg = RetCode.SUCCESS.getMessage();
        this.data = new ArrayList<>();
    }

    /**
     * 正常情况下返回状态码
     * **/
    public RetResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 失败情况下只返回状态码
     * **/
    public RetResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    /**
     * 返回状态码和数据
     * **/
    public RetResult(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }

    public RetResult(Object data) {
        this.code = RetCode.SUCCESS.getCode();
        this.msg = RetCode.SUCCESS.getMessage();
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
