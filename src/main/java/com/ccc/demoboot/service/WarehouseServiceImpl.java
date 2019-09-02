package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Warehouse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.ccc.demoboot.mapper.WarehouseMapper;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Resource
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> selectByGoodid(String goodId) {
        return warehouseMapper.selectByGoodid(goodId);
    }
}
