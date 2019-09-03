package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.ccc.demoboot.mapper.WarehouseMapper;
import com.ccc.demoboot.domain.Warehouse;
import com.ccc.demoboot.service.WarehouseService;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Resource
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> selectAllWarehouse() {
        return warehouseMapper.selectAll();
    }

    @Override
    public List<Warehouse> selectByGoodid(int goodId) {
        return warehouseMapper.selectByGoodid(goodId);
    }


}
