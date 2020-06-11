package com.springboot.hotel.demo.entity;

public class Roomimg {
    private Integer imgid;

    private Integer roomid;

    private String imgurl;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}