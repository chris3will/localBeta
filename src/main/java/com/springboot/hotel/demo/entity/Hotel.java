package com.springboot.hotel.demo.entity;

public class Hotel {
    private Integer hotelid;

    private String hotelchinesename;

    private String hotelenglishname;

    private String location;

    private String nation;

    private String province;

    private String city;

    private String region;

    private String address;

    private Integer score;

    private String imgurl1;

    private String imgurl2;

    private String imgurl3;

    private String imgurl4;

    private String imgurl5;

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelchinesename() {
        return hotelchinesename;
    }

    public void setHotelchinesename(String hotelchinesename) {
        this.hotelchinesename = hotelchinesename == null ? null : hotelchinesename.trim();
    }

    public String getHotelenglishname() {
        return hotelenglishname;
    }

    public void setHotelenglishname(String hotelenglishname) {
        this.hotelenglishname = hotelenglishname == null ? null : hotelenglishname.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getImgurl1() {
        return imgurl1;
    }

    public void setImgurl1(String imgurl1) {
        this.imgurl1 = imgurl1 == null ? null : imgurl1.trim();
    }

    public String getImgurl2() {
        return imgurl2;
    }

    public void setImgurl2(String imgurl2) {
        this.imgurl2 = imgurl2 == null ? null : imgurl2.trim();
    }

    public String getImgurl3() {
        return imgurl3;
    }

    public void setImgurl3(String imgurl3) {
        this.imgurl3 = imgurl3 == null ? null : imgurl3.trim();
    }

    public String getImgurl4() {
        return imgurl4;
    }

    public void setImgurl4(String imgurl4) {
        this.imgurl4 = imgurl4 == null ? null : imgurl4.trim();
    }

    public String getImgurl5() {
        return imgurl5;
    }

    public void setImgurl5(String imgurl5) {
        this.imgurl5 = imgurl5 == null ? null : imgurl5.trim();
    }
}