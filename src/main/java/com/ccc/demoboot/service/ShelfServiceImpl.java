package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Shelf;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.ccc.demoboot.mapper.ShelfMapper;
import com.ccc.demoboot.service.ShelfService;

import java.util.List;

@Service
public class ShelfServiceImpl implements ShelfService {

    @Resource
    private ShelfMapper shelfMapper;

    @Override
    public List<Shelf> selectByGoodid(String goodId, String warehouseId) {
        return shelfMapper.selectByGoodid(goodId, warehouseId);
    }

    @Override
    public int updateGoods(Shelf shelf) {
        return shelfMapper.updateByPrimaryKey(shelf);
    }
}
