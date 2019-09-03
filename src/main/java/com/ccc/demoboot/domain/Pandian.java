package com.ccc.demoboot.domain;

import javax.persistence.Id;
import java.util.Date;

public class Pandian {
    @Id
    private Integer id;

    private Date pdtime;

    private String pdrname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPdtime() {
        return pdtime;
    }

    public void setPdtime(Date pdtime) {
        this.pdtime = pdtime;
    }

    public String getPdrname() {
        return pdrname;
    }

    public void setPdrname(String pdrname) {
        this.pdrname = pdrname;
    }
}