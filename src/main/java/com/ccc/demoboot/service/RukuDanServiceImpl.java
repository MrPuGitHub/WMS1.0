package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.RuKuDan;
import com.ccc.demoboot.mapper.RuKuDanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RukuDanServiceImpl implements RukuDanService {

    @Autowired
    RuKuDanMapper ruKuDanMapper;
    @Override
    public List<RuKuDan> selectByAll() {
        return ruKuDanMapper.selectByAll();
    }

    @Override
    public RuKuDan selectById(Integer id) {
        return ruKuDanMapper.selectByPrimaryKey(id);
    }
}
