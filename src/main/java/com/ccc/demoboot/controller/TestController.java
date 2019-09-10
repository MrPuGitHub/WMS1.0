package com.ccc.demoboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MHJ
 * create 2019-08 10:12
 */
@Controller
public class TestController {
    @RequestMapping("/tmp")
    public String test(){
        return "tmp";
    }
}
