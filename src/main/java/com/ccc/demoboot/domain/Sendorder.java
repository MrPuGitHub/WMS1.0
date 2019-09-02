package com.ccc.demoboot.domain;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Table(name = "sendorder")
public class Sendorder {
    @Id
    @Column(name = "sendOrderId")
    @GeneratedValue(generator = "JDBC")
    private String sendorderid;

    @Column(name = "userName")
    private String username;

    @Column(name = "userAddress")
    private String useraddress;

    @Column(name = "telNum")
    private String telnum;

    @Column(name = "goodId")
    private String goodid;

    @Column(name = "goodNum")
    private String goodnum;

    @Column(name = "sendName")
    private String sendname;

    @Column(name = "sendCom")
    private String sendcom;

    @Column(name = "comAddress")
    private String comaddress;

    /**
     * @return sendOrderId
     */
    public String getSendorderid() {
        return sendorderid;
    }

    /**
     * @param sendorderid
     */
    public void setSendorderid(String sendorderid) {
        this.sendorderid = sendorderid;
    }

    /**
     * @return userName
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return userAddress
     */
    public String getUseraddress() {
        return useraddress;
    }

    /**
     * @param useraddress
     */
    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    /**
     * @return telNum
     */
    public String getTelnum() {
        return telnum;
    }

    /**
     * @param telnum
     */
    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    /**
     * @return goodId
     */
    public String getGoodid() {
        return goodid;
    }

    /**
     * @param goodid
     */
    public void setGoodid(String goodid) {
        this.goodid = goodid;
    }

    /**
     * @return goodNum
     */
    public String getGoodnum() {
        return goodnum;
    }

    /**
     * @param goodnum
     */
    public void setGoodnum(String goodnum) {
        this.goodnum = goodnum;
    }

    /**
     * @return sendName
     */
    public String getSendname() {
        return sendname;
    }

    /**
     * @param sendname
     */
    public void setSendname(String sendname) {
        this.sendname = sendname;
    }

    /**
     * @return sendCom
     */
    public String getSendcom() {
        return sendcom;
    }

    /**
     * @param sendcom
     */
    public void setSendcom(String sendcom) {
        this.sendcom = sendcom;
    }

    /**
     * @return comAddress
     */
    public String getComaddress() {
        return comaddress;
    }

    /**
     * @param comaddress
     */
    public void setComaddress(String comaddress) {
        this.comaddress = comaddress;
    }
}