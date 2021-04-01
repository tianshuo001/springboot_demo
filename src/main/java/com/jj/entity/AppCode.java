package com.jj.entity;

/**
 * @ClassName AppCodes
 * @Description TODO
 * @Author tianshuo
 * @Date 2021/3/16 16:39
 * @Version 1.0
 **/
public class AppCode {
    private Integer id;
    private Integer appId;
    private String appName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
