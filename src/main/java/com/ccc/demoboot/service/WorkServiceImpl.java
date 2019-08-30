package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Work;
import com.ccc.demoboot.mapper.WorkMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {

    @Resource(name = "workMapper")
    private WorkMapper workMapper;


    @Override
    public List<Work> selAllWork() {
        return workMapper.selectAll();
    }

    @Override
    public String getAllwork() {
        List<Work> works = workMapper.selectAll();
        for (Work worklist:works) {
            StringBuilder sb=new StringBuilder();
            sb.append("");
            System.out.println(worklist.getWorkname());
        }
        return works.toString();
    }
}

