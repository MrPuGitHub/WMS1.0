package com.ccc.demoboot.domain;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

public class Emp {

    @Id
    private Integer id;

    private String empname;

    private Integer empid;

    @Transient
    private EmpWork empworkobj;

    @Transient
    private List<Work> workList;

    public List<Work> getWorkList() {
        return workList;
    }

    public void setWorkList(List<Work> workList) {
        this.workList = workList;
    }

    public EmpWork getEmpworkobj() {
        return empworkobj;
    }

    public void setEmpworkobj(EmpWork empworkobj) {
        this.empworkobj = empworkobj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}