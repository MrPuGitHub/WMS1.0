package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.ccc.demoboot.mapper.InstoreMapper;
import com.ccc.demoboot.domain.Instore;
import com.ccc.demoboot.service.InstoreService;

import java.util.List;

@Service
public class InstoreServiceImpl implements InstoreService {

    @Resource
    private InstoreMapper instoreMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return instoreMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Instore record) {
        return instoreMapper.insert(record);
    }

    @Override
    public int insertSelective(Instore record) {
        return instoreMapper.insertSelective(record);
    }

    @Override
    public Instore selectByPrimaryKey(Integer id) {
        return instoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Instore record) {
        return instoreMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Instore record) {
        return instoreMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Instore> selectByAll() {
        return instoreMapper.selectByAll();
    }

    @Override
    public String selectUsernameWithInstore(Integer id) {
        return instoreMapper.selectUsernameWithInstore(id);
    }

    //根据商品的ids批量删除商品信息
//    @Override
//    public Boolean deleteMutiId() {
//        return null;
//    }
}
