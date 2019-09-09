package com.ccc.demoboot.domain;

import java.util.Date;

public class Mrb {

    /**
    * 退货单id
    */
    private Integer id;

    /**
    * 退货时间
    */
    private Date outtime;

    /**
    * 商品id
    */
    private Integer goodid;

    /**
    * 商品数量
    */
    private Integer goodamount;

    /**
    * 经办人id
    */
    private Integer userid;

    /**
    * 描述(退货原因)
    */
    private String description;

    private Integer orderid;

    private Integer cansel;

    private String state;

    private Integer warehouseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getGoodamount() {
        return goodamount;
    }

    public void setGoodamount(Integer goodamount) {
        this.goodamount = goodamount;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getCansel() {
        return cansel;
    }

    public void setCansel(Integer cansel) {
        this.cansel = cansel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }
}