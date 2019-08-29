package com.ccc.demoboot.Controller;


import com.ccc.demoboot.domain.User;
import com.ccc.demoboot.service.ShelfService;
import com.ccc.demoboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class MrbController {

    @Resource(name = "shelfServiceImpl")
    ShelfService shelfService;
@RequestMapping(value = "/mrboperation")
    public String mrboperation(){
    return "mrboperation";
}

}




