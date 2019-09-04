package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Pandian;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PandianMapper extends Mapper<Pandian> {

    List<Pandian> selectPanDian(Pandian pd);


}