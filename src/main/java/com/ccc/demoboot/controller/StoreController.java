package com.ccc.demoboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StoreController {

    @RequestMapping("/main")
    public String main(){
        return "store/main";
    }
    @RequestMapping("/nav")
    public String nav(){
        return "store/nav";
    }

    @RequestMapping("/storeList")
    public String storeList(){
        return "store/storeList";
    }

    @RequestMapping("/storeDetail")
    public String storeDetail(){
        return "store/storeDetail";
    }

//    @RequestMapping("/selectById/${id}")
//    public String selectById(HttpServletRequest request, Model model, @PathVariable(value = "id" )Integer id){
//        return "store/storeList";
//    }
}
