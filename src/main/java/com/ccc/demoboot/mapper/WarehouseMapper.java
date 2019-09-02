package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Warehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehouseMapper extends tk.mybatis.mapper.common.Mapper<Warehouse> {
    List<Warehouse> selectByGoodid(String goodId);
}