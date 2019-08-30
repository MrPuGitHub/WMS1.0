package com.ccc.demoboot.service;

import com.ccc.demoboot.mapper.EmpWorkMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class EmpWorkServiceImpl implements EmpWorkService{

    @Resource(name = "empWorkMapper")
    private EmpWorkMapper empWorkMapper;


}
