package com.ccc.demoboot.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class PanyinPankui {
    /**
    * 盘点计划编号
    */
    @Id
    private Integer id;

    private Integer pandiandanid;

    /**
    * 盘点对应的仓库id
    */
    private String warehouseName;

    /**
    * 盘点对应的货架号
    */
    private String shelfposition;

    /**
    * 盘点所得warehouseid仓库中对应的实际库量
    */
    private Integer goodid;

    private String goodname;

    private String unit;

    private Integer zmsl;

    private Integer pdsl;

    private Integer yksl;

    private Double price;

    private Double ykje;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPandiandanid() {
        return pandiandanid;
    }

    public void setPandiandanid(Integer pandiandanid) {
        this.pandiandanid = pandiandanid;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getShelfposition() {
        return shelfposition;
    }

    public void setShelfposition(String shelfposition) {
        this.shelfposition = shelfposition;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getZmsl() {
        return zmsl;
    }

    public void setZmsl(Integer zmsl) {
        this.zmsl = zmsl;
    }

    public Integer getPdsl() {
        return pdsl;
    }

    public void setPdsl(Integer pdsl) {
        this.pdsl = pdsl;
    }

    public Integer getYksl() {
        return yksl;
    }

    public void setYksl(Integer yksl) {
        this.yksl = yksl;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getYkje() {
        return ykje;
    }

    public void setYkje(Double ykje) {
        this.ykje = ykje;
    }

}