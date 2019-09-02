package com.ccc.demoboot.controller;

import com.ccc.demoboot.domain.PanyinPankui;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.domain.Warehouse;
import com.ccc.demoboot.service.PanyinPankuiService;
import com.ccc.demoboot.service.ShelfService;
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

    @Resource(name = "shelfServiceImpl")
    ShelfService shelfService;


    @Resource(name = "panyinPankuiServiceImpl")
    PanyinPankuiService panyinPankuiService;

    @RequestMapping(value = "/pandian")
    public String pandian() {

        return "PanDian/pandian";
    }

    @RequestMapping(value = "/warehouse")
    public String warehouse(HttpServletRequest req) {

        List<Warehouse> warehouseList = warehouseService.selectAllWarehouse();

        List<Shelf> shelfList = shelfService.selectAllShelf();

        System.out.println(warehouseList.get(0).getWarehouseName());

        req.setAttribute("warehouseList", warehouseList);

        req.setAttribute("shelfList", shelfList);
        return "PanDian/pandiandan";
    }


    @RequestMapping(value = "/add")
    public String add(HttpServletRequest req, PanyinPankui record) {

        panyinPankuiService.insert(record);
        return "PanDian/pandiandan";
    }
}
