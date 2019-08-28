package com.ccc.demoboot.service;


import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.mapper.ChuKuDanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChuKuServiceImpl implements ChuKuService{

    @Resource
    ChuKuDanMapper chuKuDanMapper;

    @Override
    public List<ChuKuDan> selAllChuKuDan() {
        return chuKuDanMapper.selectAll();
    }

}
