package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.PanyinPankui;

import java.util.List;

public interface PanyinPankuiService{


    int deleteByPrimaryKey(Integer id);

    int insert(PanyinPankui record);

    int insertSelective(PanyinPankui record);

    PanyinPankui selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PanyinPankui record);

    int updateByPrimaryKey(PanyinPankui record);

    List<PanyinPankui> selectAllPanyinPankui();
}
