package com.ccc.demoboot.controller;

import com.ccc.demoboot.common.Compagesize;
import com.ccc.demoboot.domain.Instore;
import com.ccc.demoboot.service.InstoreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Resource(name = "instoreServiceImpl")
    InstoreService instoreService;

    @RequestMapping("/main")
    public String main(){
        return "store/main";
    }
    @RequestMapping("/nav")
    public String nav(){
        return "store/nav";
    }

    @RequestMapping("/modal")
    public String modal(){
        return "store/modal";
    }

    @RequestMapping("/popup")
    public String popup(){
        return "store/popup";
    }

    @RequestMapping("/storeList/{pageNum}")
    public String storeList(HttpServletRequest request, Model model,@PathVariable(value = "pageNum") int pageNum){

        int pageSize = Compagesize.getPagesize(); //每页显示的条数

        PageHelper.startPage(pageNum,pageSize);
        List<Instore> instoreList = instoreService.selectByAll();
        PageInfo pageInfo = new PageInfo(instoreList);
        System.out.println(pageInfo);
        request.setAttribute("pageInfo",pageInfo);
        request.setAttribute("instoreList",instoreList);

        return "store/storeList";
    }

    @RequestMapping(value = "/detail/{id}")
    public String storeDetail(HttpServletRequest request,Model model,@PathVariable(value = "id") Integer id){
        Instore instore  = instoreService.selectById(id);
        String userName=instoreService.selectUsernameWithInstore(instore.getUserid());
        System.out.println(instore.getUserid());
        request.setAttribute("instore",instore);
        request.setAttribute("userName",userName);
        return "store/storeDetail";
    }

    //根据商品id删除商品信息
    @RequestMapping(value = "/delete/{id}")
    public String goodsDelete(HttpServletRequest request, HttpServletResponse response,Model model, @PathVariable(value = "id") Integer id) throws IOException {
        System.out.println(id);
        PrintWriter out = response.getWriter();
        out.println("success");

        return "store/storeDetail";
    }

}
