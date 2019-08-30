package com.ccc.demoboot.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.ccc.demoboot.mapper.WarehouseMapper;
import com.ccc.demoboot.domain.Warehouse;
import com.ccc.demoboot.service.WarehouseService;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService{

    @Resource
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> selectAllWarehouse() {
        return warehouseMapper.selectAll();
    }

//    @Override
//    public String getAllWarehouse(int warehouseid) {
//        List<Warehouse> a = warehouseMapper.selectAll();
//        StringBuilder sg = new StringBuilder();
//        for (Warehouse warehouse : a) {
//            if (warehouseid == warehouse.getId()) {
//                sg.append("<option selected='selected' value='"
//                        + warehouse.getId() + "'>");
//                sg.append(warehouse.getWarehouseName());
//                sg.append("</option>");
//            } else {
//                sg.append("<option value='" + warehouse.getId() + "'>");
//                sg.append(warehouse.getWarehouseName());
//                sg.append("</option>");
//            }
//
//        }
//        return sg.toString();
//    }

}
