package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Shelf;

import java.util.List;

public interface ShelfService {
    List<Shelf> selectAllShelf();

    // List<Shelf> selectByGoodid(String goodId, String warehouseId);

    int updateGoods(Shelf shelf);
}
