package com.ccc.demoboot.Controller;


import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.service.MrbService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class MrbController {

    @Resource(name = "mrbServiceImpl")
    MrbService mrbService;

    @RequestMapping(value = "/mrboperation")
    public String mrboperation(HttpServletRequest request){

        List<Shelf> list = mrbService.selAllShelf();
        request.setAttribute("shelfList",list);

        return "mrb/mrboperation";
}

}




