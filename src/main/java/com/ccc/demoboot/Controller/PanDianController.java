package com.ccc.demoboot.Controller;

import com.ccc.demoboot.domain.Warehouse;
import com.ccc.demoboot.service.WarehouseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class PanDianController {

    @Resource(name = "warehouseServiceImpl")
    WarehouseService warehouseService;

    @RequestMapping(value = "/pandian")
    public String pandian() {

        return "PanDian/pandian";
    }

    @RequestMapping(value = "/warehouse")
    public String warehouse(HttpServletRequest req) {

        List<Warehouse> warehouseList = warehouseService.selectAllWarehouse();

        System.out.println(warehouseList.get(0).getWarehouseName());
        req.setAttribute("warehouseList", warehouseList);
        return "PanDian/pandiandan";
    }
}
