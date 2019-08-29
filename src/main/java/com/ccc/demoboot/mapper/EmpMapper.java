package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Emp;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;


@org.apache.ibatis.annotations.Mapper
public interface EmpMapper extends Mapper<Emp> {

//   Map<Object,String> selectAllEmpAndwork();
}