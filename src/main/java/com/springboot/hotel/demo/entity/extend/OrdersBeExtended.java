package com.springboot.hotel.demo.entity.extend;

public class OrdersBeExtended {
    //类别名
    //显示用户信息必要的
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    //显示room信息必要的
    private int hotelid;

    private String roomtype;

    private String bedtype;

    private String service;

    private Boolean hasbreakfast;

    private Integer price;
    private int commentnum;


    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public int getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(int commentnum) {
        this.commentnum = commentnum;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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

    @Override
    public String toString() {
        return "OrdersBeExtended{" +
                "username='" + username + '\'' +
                ", hotelid=" + hotelid +
                ", commentnum=" + commentnum +
                ", roomtype='" + roomtype + '\'' +
                ", bedtype='" + bedtype + '\'' +
                ", service='" + service + '\'' +
                ", hasbreakfast=" + hasbreakfast +
                ", price=" + price +
                '}';
    }
}
