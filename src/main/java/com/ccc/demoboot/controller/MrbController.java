package com.ccc.demoboot.controller;


import com.ccc.demoboot.common.Compagesize;
import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.domain.Emp;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.service.MrbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class MrbController {

    @Resource(name = "mrbServiceImpl")
    MrbService mrbService;
//退货货架
    @RequestMapping(value = "/selAllShelf/{pageNum}")
    public String selAllShelf(HttpServletRequest request ,Shelf shelf,@PathVariable(value = "pageNum") int pageNum){

        String goodid = request.getParameter("goodid");
       // System.out.println(23);
        List<Shelf> list = null;
        PageInfo<Shelf> pageInfo = null;
        if (goodid !=null  && goodid != ""){
            Integer gid = Integer.parseInt(goodid);
            PageHelper.startPage(pageNum, 5);
            list = mrbService.selectAllByGoodid(gid);
            pageInfo = new PageInfo<>(list);
        }else{
            //分页1
            PageHelper.startPage(pageNum, 5);
            list = mrbService.selAllShelf(shelf);
            pageInfo = new PageInfo<>(list);
        }



        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("shelfList",list);
        return "mrb/mrboperation";
}


}




