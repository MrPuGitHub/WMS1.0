package com.ccc.demoboot.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Table(name = "shelf")
public class Shelf {
    /**
     * 货架编号，主键，递增
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 商品id
     */
    @Column(name = "goodId")
    private Integer goodid;

    /**
     * 指定id的商品对应的本区库存数量
     */
    @Column(name = "goodamount")
    private Integer goodamount;

    /**
     * 货架所属的仓库id
     */
    @Column(name = "warehouseid")
    private Integer warehouseid;

    /**
     * 货架位置名称
     */
    @Column(name = "shelfposition")
    private String shelfposition;

    /**
     * 获取货架编号，主键，递增
     *
     * @return id - 货架编号，主键，递增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置货架编号，主键，递增
     *
     * @param id 货架编号，主键，递增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取商品id
     *
     * @return goodId - 商品id
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
     * 获取货架所属的仓库id
     *
     * @return warehouseid - 货架所属的仓库id
     */
    public Integer getWarehouseid() {
        return warehouseid;
    }

    /**
     * 设置货架所属的仓库id
     *
     * @param warehouseid 货架所属的仓库id
     */
    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    /**
     * 获取货架位置名称
     *
     * @return shelfposition - 货架位置名称
     */
    public String getShelfposition() {
        return shelfposition;
    }

    /**
     * 设置货架位置名称
     *
     * @param shelfposition 货架位置名称
     */
    public void setShelfposition(String shelfposition) {
        this.shelfposition = shelfposition;
    }
}