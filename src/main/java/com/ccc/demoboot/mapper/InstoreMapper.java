package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Instore;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface InstoreMapper extends Mapper<Instore> {
//    int deleteByPrimaryKey(Integer id);
//
//    int insert(Instore record);
//
//    int insertSelective(Instore record);
//
//    Instore selectByPrimaryKey(Integer id);
//
//    int updateByPrimaryKeySelective(Instore record);
//
//    int updateByPrimaryKey(Instore record);

    List<Instore> selectByAll();

    String selectUsernameWithInstore(Integer id);
//    Boolean deleteMutiId();
}