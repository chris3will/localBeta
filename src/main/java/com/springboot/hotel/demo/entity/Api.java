package com.springboot.hotel.demo.entity;

public class Api {
    private Integer sid;

    private String apiurl;

    private String function;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getApiurl() {
        return apiurl;
    }

    public void setApiurl(String apiurl) {
        this.apiurl = apiurl == null ? null : apiurl.trim();
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }
}