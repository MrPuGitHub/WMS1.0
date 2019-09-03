package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ccc.demoboot.mapper.PandianMapper;
import com.ccc.demoboot.domain.Pandian;
import com.ccc.demoboot.service.PandianService;

import java.util.List;
//你好你好123123
@Service
public class PandianServiceImpl implements PandianService{

    @Resource
    private PandianMapper pandianMapper;


    @Override
    public List<Pandian> selectAllPanDian() {
        return pandianMapper.selectAll();
    }


}
