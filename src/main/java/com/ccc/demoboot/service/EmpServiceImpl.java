package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ccc.demoboot.mapper.EmpMapper;
import com.ccc.demoboot.domain.Emp;
import com.ccc.demoboot.service.EmpService;
@Service
public class EmpServiceImpl implements EmpService{

    @Resource(name = "empMapper")
    EmpMapper empMapper;
}
