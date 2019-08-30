package com.ccc.demoboot.domain;

import javax.persistence.Id;

public class Warehouse {
    @Id
    private Integer id;

    /**
    * 商品id
    */
    private Integer goodid;

    /**
    * 指定id的商品对应的本区库存数量
    */
    private Integer goodamount;

    /**
    * 距离分拨中心的距离
    */
    private String kind;
    /**
     * 仓库名
     */

    private String warehouseName;

    /**
    * 库区种类
    */
    private Integer cityid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }
}