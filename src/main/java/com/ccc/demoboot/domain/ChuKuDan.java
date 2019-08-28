package com.ccc.demoboot.domain;

import java.util.Date;

public class ChuKuDan {
    private Integer id;

    private Integer chukuid;

    private Integer goodid;

    private Integer outnum;

    private Integer userid;

    private Date outtime;

    private String state;

    private Integer orderid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChukuid() {
        return chukuid;
    }

    public void setChukuid(Integer chukuid) {
        this.chukuid = chukuid;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getOutnum() {
        return outnum;
    }

    public void setOutnum(Integer outnum) {
        this.outnum = outnum;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}