
package com.ccc.demoboot.controller;


import com.ccc.demoboot.common.Compagesize;
import com.ccc.demoboot.domain.Pandian;
import com.ccc.demoboot.domain.PanyinPankui;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.domain.Warehouse;
import com.ccc.demoboot.service.PandianService;
import com.ccc.demoboot.service.PanyinPankuiService;
import com.ccc.demoboot.service.ShelfService;
import com.ccc.demoboot.service.WarehouseService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    /**
     * 进入盘点页面和搜索操作
     */

    @RequestMapping(value = "/pandian/{pagenum}")
    public String pandian(HttpServletRequest req,Pandian pd, @PathVariable(value = "pagenum") int pagenum) {
        int pagesize=new Compagesize().getPagesize();
        PageHelper.startPage(pagenum,pagesize);

        List<Pandian> pandianlist = pandianService.selectAllPanDian(pd);
        PageInfo pageInfo=new PageInfo(pandianlist);
        req.setAttribute("pandianlist", pandianlist);
        req.setAttribute("pageinfo", pageInfo);
        return "PanDian/pandian";
    }


    /**
     * 查询获取下拉框里面的内容
     */

    @RequestMapping(value = "/warehouse")
    public String warehouse(HttpServletRequest req) {

        List<Warehouse> warehouseList = warehouseService.selectAllWarehouse();

        List<Shelf> shelfList = shelfService.selectAllShelf();

        List<Pandian> pandianList = pandianService.selectAllPanDian();

        System.out.println(warehouseList.get(0).getWarehouseName());

        req.setAttribute("warehouseList", warehouseList);
        req.setAttribute("shelfList", shelfList);
        req.setAttribute("pandianList", pandianList);

        return "PanDian/pandiandan";
    }

    /**
     * 添加盘点单明细
     */

    @RequestMapping(value = "/add")

    public String add(HttpServletRequest req, PanyinPankui record) {

        panyinPankuiService.insert(record);

        return "redirect:/pandian/1";
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
