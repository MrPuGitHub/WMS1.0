package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.ccc.demoboot.mapper.ShelfMapper;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.service.ShelfService;

import java.util.List;

@Service
public class ShelfServiceImpl implements ShelfService {

    @Resource
    private ShelfMapper shelfMapper;

    @Override
    public List<Shelf> selectAllShelf() {
        return shelfMapper.selectAll();
    }

    @Override
    public List<Shelf> selectByGoodid(int goodId, int warehouseId) {
        return shelfMapper.selectByGoodid(goodId, warehouseId);
    }

    @Override
    public int updateGoods(Shelf shelf) {

        return shelfMapper.updateByPrimaryKey(shelf);
    }
}
