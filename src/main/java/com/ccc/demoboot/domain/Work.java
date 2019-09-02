package com.ccc.demoboot.domain;

import javax.persistence.Id;

public class Work {

    @Id
    private Integer id;

    private String workname;

    private String workcorde;

    private Integer worknum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getWorkcorde() {
        return workcorde;
    }

    public void setWorkcorde(String workcorde) {
        this.workcorde = workcorde;
    }

    public Integer getWorknum() {
        return worknum;
    }

    public void setWorknum(Integer worknum) {
        this.worknum = worknum;
    }
}