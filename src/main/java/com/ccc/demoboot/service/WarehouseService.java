package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Warehouse;

import java.util.List;

public interface WarehouseService {


    List<Warehouse> selectAllWarehouse();

    List<Warehouse> selectByGoodid(int goodId);

}
