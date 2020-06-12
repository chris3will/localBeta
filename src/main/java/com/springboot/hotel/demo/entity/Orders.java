package com.springboot.hotel.demo.entity;

import com.springboot.hotel.demo.entity.extend.OrdersBeExtended;

import java.util.Date;

public class Orders extends OrdersBeExtended {
    private Integer orderid;

    private Integer id;

    private Integer roomid;

    private Date enterdate;

    private Date exitdate;

    private Date starttime;

    private Date closetime;

    private Boolean canbeunsubscribe;

    private Integer orderstatus;

    private Boolean iccommented;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public Date getExitdate() {
        return exitdate;
    }

    public void setExitdate(Date exitdate) {
        this.exitdate = exitdate;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public Boolean getCanbeunsubscribe() {
        return canbeunsubscribe;
    }

    public void setCanbeunsubscribe(Boolean canbeunsubscribe) {
        this.canbeunsubscribe = canbeunsubscribe;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Boolean getIccommented() {
        return iccommented;
    }

    public void setIccommented(Boolean iccommented) {
        this.iccommented = iccommented;
    }
}