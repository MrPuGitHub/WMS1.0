package com.ccc.demoboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/main")
    public String main(){
        return "store/stockMain";
    }
}
