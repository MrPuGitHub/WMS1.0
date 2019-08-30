package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ccc.demoboot.mapper.PanyinPankuiMapper;
import com.ccc.demoboot.domain.PanyinPankui;
import com.ccc.demoboot.service.PanyinPankuiService;
@Service
public class PanyinPankuiServiceImpl implements PanyinPankuiService{

    @Resource
    private PanyinPankuiMapper panyinPankuiMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return panyinPankuiMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PanyinPankui record) {
        return panyinPankuiMapper.insert(record);
    }

    @Override
    public int insertSelective(PanyinPankui record) {
        return panyinPankuiMapper.insertSelective(record);
    }

    @Override
    public PanyinPankui selectByPrimaryKey(Integer id) {
        return panyinPankuiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PanyinPankui record) {
        return panyinPankuiMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PanyinPankui record) {
        return panyinPankuiMapper.updateByPrimaryKey(record);
    }

}
