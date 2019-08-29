package com.ccc.demoboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PanDianController {
    @RequestMapping(value = "/pandian")
    public String pandian(){

        return "PanDian/pandian";
    }
}
