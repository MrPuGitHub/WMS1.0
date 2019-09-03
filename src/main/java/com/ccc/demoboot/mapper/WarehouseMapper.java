package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Warehouse;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface WarehouseMapper extends Mapper<Warehouse> {
    List<Warehouse> selectByGoodid(int goodId);
}