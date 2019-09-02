package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.Shelf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShelfMapper extends tk.mybatis.mapper.common.Mapper<Shelf> {
    List<Shelf> selectByGoodid(String goodId,String warehouseId);
}