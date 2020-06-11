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
}