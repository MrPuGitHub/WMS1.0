package com.ccc.demoboot.domain;

import org.springframework.data.annotation.Id;

public class Shelf {
    /**
     * 货架编号，主键，递增
     */
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
     * 货架所属的仓库id
     */
    private Integer warehouseid;

    /**
     * 货架位置名称
     */
    private String shelfposition;

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

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getShelfposition() {
        return shelfposition;
    }

    public void setShelfposition(String shelfposition) {
        this.shelfposition = shelfposition;
    }
}