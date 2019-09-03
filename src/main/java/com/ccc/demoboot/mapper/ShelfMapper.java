package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Shelf;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ShelfMapper extends Mapper<Shelf> {
    List<Shelf> selectByGoodid(int goodId, int warehouseId);
}