package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Emp;
import com.ccc.demoboot.mapper.EmpMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{

    @Resource(name = "empMapper")
    EmpMapper empMapper;

    @Override
    public List<Emp> selectAllEmpAndwork(Emp emp) {

        emp.setEmpname("%"+emp.getEmpname()+"%");
        return empMapper.selectAllEmpAndwork(emp);
    }

}
