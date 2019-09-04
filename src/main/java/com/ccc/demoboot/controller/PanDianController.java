
package com.ccc.demoboot.controller;


import com.ccc.demoboot.domain.Pandian;
import com.ccc.demoboot.domain.PanyinPankui;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.domain.Warehouse;
import com.ccc.demoboot.service.PandianService;
import com.ccc.demoboot.service.PanyinPankuiService;
import com.ccc.demoboot.service.ShelfService;
import com.ccc.demoboot.service.WarehouseService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Controller
public class PanDianController {

    @Resource(name = "warehouseServiceImpl")
    WarehouseService warehouseService;

    @Resource(name = "shelfServiceImpl")
    ShelfService shelfService;

    @Resource(name = "pandianServiceImpl")
    PandianService pandianService;

    @Resource(name = "panyinPankuiServiceImpl")
    PanyinPankuiService panyinPankuiService;


    @RequestMapping(value = "/pandian")
    public String pandian(HttpServletRequest req) {

        List<Pandian> pandianlist = pandianService.selectAllPanDian();
        req.setAttribute("pandianlist", pandianlist);

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

        return "redirect:/panyinpankui/1";
    }

    /**
     * 查询盘点单明细
     */

    @RequestMapping(value = "/panyinpankui/{id}")
    public String panyinpankui(HttpServletRequest req, @PathVariable("id") Integer param1) {

        System.out.println("pk=" + param1);

        List<PanyinPankui> lllll = panyinPankuiService.selectByIdPanDian(param1);
        req.setAttribute("lllll", lllll);

        return "PanDian/pandian-detail";
    }

}
