package com.springboot.hotel.demo.entity;

public class HotelImg {
    private Integer imgid2;

    private Integer hotelid;

    private String imgurl;

    public Integer getImgid2() {
        return imgid2;
    }

    public void setImgid2(Integer imgid2) {
        this.imgid2 = imgid2;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}