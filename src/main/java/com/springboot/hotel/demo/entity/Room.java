package com.springboot.hotel.demo.entity;

public class Room {
    private Integer roomid;

    private Integer hotelid;

    private String roomtype;

    private String bedtype;

    private String service;

    private Boolean hasbreakfast;

    private Integer price;

    private Integer commentnum;

    private Integer collectnum;

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype == null ? null : bedtype.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public Boolean getHasbreakfast() {
        return hasbreakfast;
    }

    public void setHasbreakfast(Boolean hasbreakfast) {
        this.hasbreakfast = hasbreakfast;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public Integer getCollectnum() {
        return collectnum;
    }

    public void setCollectnum(Integer collectnum) {
        this.collectnum = collectnum;
    }
}