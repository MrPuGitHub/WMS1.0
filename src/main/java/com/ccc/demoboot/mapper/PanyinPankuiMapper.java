package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Pandian;
import com.ccc.demoboot.domain.PanyinPankui;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface PanyinPankuiMapper extends Mapper<PanyinPankui> {
    List<PanyinPankui> selectByIdPanDian(Integer pandianid);
}