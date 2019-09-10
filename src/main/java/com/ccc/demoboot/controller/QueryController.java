package com.ccc.demoboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MHJ
 * create 2019-09 15:39
 */
@Controller
public class QueryController {
    @RequestMapping(value = "stat_query")
    public String startQuery(){
        return "/stat_query/stat_query";
    }
    @RequestMapping(value = "outgoods")
    public String outGoods(){
        return "/stat_query/outGoods";
    }
    @RequestMapping(value = "ingoods")
    public String inGoods(){
        return "/stat_query/inGoods";
    }
    @RequestMapping(value = "warehousequery")
    public String warehouseQuery(){
        return "/stat_query/warehouseQuery";
    }
}
