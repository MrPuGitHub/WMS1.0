package com.ccc.demoboot.domain;

import javax.persistence.Id;

public class EmpWork {

    @Id
    private Integer id;

    private Integer empid;

    private Integer workid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getWorkid() {
        return workid;
    }

    public void setWorkid(Integer workid) {
        this.workid = workid;
    }
}