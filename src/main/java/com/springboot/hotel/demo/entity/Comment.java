package com.springboot.hotel.demo.entity;

import java.util.Date;

public class Comment extends CommentKey {
    private Integer commentid;

    private Date commenttime;

    private String commentmsg;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public String getCommentmsg() {
        return commentmsg;
    }

    public void setCommentmsg(String commentmsg) {
        this.commentmsg = commentmsg == null ? null : commentmsg.trim();
    }
}