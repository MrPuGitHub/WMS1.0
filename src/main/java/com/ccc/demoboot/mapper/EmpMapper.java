package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Emp;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


@org.apache.ibatis.annotations.Mapper
public interface EmpMapper extends Mapper<Emp> {

   List<Emp> selectAllEmpAndwork(Emp emp);


}