package com.ccc.demoboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/exit")
    public String exit(){
        return "/login";
    }

}