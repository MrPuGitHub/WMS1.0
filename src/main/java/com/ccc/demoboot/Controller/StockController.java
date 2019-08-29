package com.ccc.demoboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StockController {

    @RequestMapping("/main")
    public String main(){
        return "store/main";


    }
}
