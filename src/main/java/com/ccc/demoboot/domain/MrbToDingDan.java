package com.ccc.demoboot.domain;

import java.util.Date;

public class MrbToDingDan {

    /**
     * 商品id
     */
    private Integer goodid;

    /**
     * 商品数量
     */
    private Integer goodamount;

    /**
     * 描述(退货原因)
     */
    private String description;

    private Integer orderid;

    private int cansel;

    private String state;


    private Integer warehouseid;

    public void setCansel(int cansel) {
        this.cansel = cansel;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
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

}
