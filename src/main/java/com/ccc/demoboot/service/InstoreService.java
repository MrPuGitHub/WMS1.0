package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Instore;

import java.util.List;

public interface InstoreService {


    int deleteByPrimaryKey(Integer id);

    int insert(Instore record);

    int insertSelective(Instore record);

    Instore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Instore record);

    int updateByPrimaryKey(Instore record);

    List<Instore> selectByAll();

    String selectUsernameWithInstore(Integer id);
//    Boolean deleteMutiId();

}
