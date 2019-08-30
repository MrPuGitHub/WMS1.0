
package com.ccc.demoboot.controller;





import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.service.ChuKuService;
import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class ChuKuController {

    @Resource(name="chuKuServiceImpl")
    private ChuKuService chuKuService;


//    出库列表页面

    @RequestMapping("/chuku/{pageNum}")
    public String chuku(HttpServletRequest request, @PathVariable(value="pageNum") Integer pageNum){

        if(pageNum <= 0){
            pageNum = 1;
        }

        PageHelper.startPage(pageNum, 5);

        List<ChuKuDan> chuKuDanList = chuKuService.selAllChuKuDan();


        PageInfo<ChuKuDan> pageInfo = new PageInfo<>(chuKuDanList);


        ChuKuDan c = chuKuDanList.get(2);


        request.setAttribute("chuKuDanList",chuKuDanList);

        request.setAttribute("pageInfo",pageInfo);

        return "ChuKu/chuku";
    }






    @RequestMapping("/chaXunFaHuoDan")
    public String chaXunFaHuoDan(HttpServletRequest request){

        String faHuoDanHao =  request.getParameter("faHuoDanHao");
        String zhuangTai =  request.getParameter("zhuangTai");
        String startTime =  request.getParameter("startTime");
        String endTime =  request.getParameter("endTime");


       System.out.println(faHuoDanHao);
        System.out.println(zhuangTai);
        System.out.println(startTime);
        System.out.println(endTime);

    return null;

    }

























    //给采购管理提供的方法
    //返回出库单对象集合
    @ResponseBody
    @RequestMapping("/selAllChuKuDan")
    public List<ChuKuDan> selAllChuKuDan(){

        return chuKuService.selAllChuKuDan();


    }


}
