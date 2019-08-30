package com.ccc.demoboot.service;

import com.ccc.demoboot.mapper.WorkMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WorkServiceImpl implements WorkService {

    @Resource(name = "workMapper")
    private WorkMapper workMapper;


}

