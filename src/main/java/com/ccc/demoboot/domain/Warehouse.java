package com.ccc.demoboot.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Table(name = "warehouse")
public class Warehouse {
    @Column(name = "id")
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "goodid")
    private Integer goodid;

    /**
     * 指定id的商品对应的本区库存数量
     */
    @Column(name = "goodamount")
    private Integer goodamount;

    /**
     * 距离分拨中心的距离
     */
    @Column(name = "kind")
    private String kind;

    /**
     * 库区种类
     */
    @Column(name = "cityid")
    private Integer cityid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品id
     *
     * @return goodid - 商品id
     */
    public Integer getGoodid() {
        return goodid;
    }

    /**
     * 设置商品id
     *
     * @param goodid 商品id
     */
    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    /**
     * 获取指定id的商品对应的本区库存数量
     *
     * @return goodamount - 指定id的商品对应的本区库存数量
     */
    public Integer getGoodamount() {
        return goodamount;
    }

    /**
     * 设置指定id的商品对应的本区库存数量
     *
     * @param goodamount 指定id的商品对应的本区库存数量
     */
    public void setGoodamount(Integer goodamount) {
        this.goodamount = goodamount;
    }

    /**
     * 获取距离分拨中心的距离
     *
     * @return kind - 距离分拨中心的距离
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置距离分拨中心的距离
     *
     * @param kind 距离分拨中心的距离
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * 获取库区种类
     *
     * @return cityid - 库区种类
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * 设置库区种类
     *
     * @param cityid 库区种类
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }
}