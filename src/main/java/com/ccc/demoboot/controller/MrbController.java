package com.ccc.demoboot.controller;


import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.service.MrbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class MrbController {

    @Resource(name = "mrbServiceImpl")
    MrbService mrbService;
//退货货架
    @RequestMapping(value = "/mrboperation")
    public String mrboperation(HttpServletRequest request){
        //分页1
        PageHelper.startPage(1, 5);
        List<Shelf> list = mrbService.selAllShelf();
        //
        PageInfo<Shelf> pageInfo = new PageInfo<>(list);
        request.setAttribute("shelfList",list);

        request.setAttribute("pageInfo",pageInfo);
        return "mrb/mrboperation";
}

}




