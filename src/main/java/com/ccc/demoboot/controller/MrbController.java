package com.ccc.demoboot.controller;


import com.ccc.demoboot.common.Compagesize;
import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.domain.Emp;
import com.ccc.demoboot.domain.Mrb;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.httpClient.ChuKuClient;
import com.ccc.demoboot.httpClient.MrbClient;
import com.ccc.demoboot.service.MrbService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;


@Controller
public class MrbController {

    @Resource(name = "mrbServiceImpl")
    MrbService mrbService;

    @RequestMapping(value = "/addgood/{goodid}/{goodamount}/{id}")
    public String addgood(HttpServletRequest request,@PathVariable(value = "goodid") Integer goodid,@PathVariable(value = "goodamount") Integer goodamount,@PathVariable(value = "id") Integer id){

        //清除session中的addSuccess属性
        request.getSession().removeAttribute("addSuccess");
        //将商品编号为goodid的goodamount件商品加入货架
        mrbService.addgood(goodid,goodamount,id);
        //加入货架成功后设置 addSuccess属性值为"加入成功"
        request.getSession().setAttribute("addSuccess","加入成功");
        return "mrb/mrbguanli";
    }

    @RequestMapping(value = "selAllMrb")
    public String selAllMrb(HttpServletRequest request) {
        List<Mrb> mrbs = mrbService.selectAllMrb();
        request.setAttribute("Mrb", mrbs);
        System.out.println(mrbs);
        return "mrb/mrblist";

    }

    //退货货架
    @RequestMapping(value = "/selAllShelf/{pageNum}/{goodid}/{goodamount}")
    public String selAllShelf(HttpServletRequest request, Shelf shelf, @PathVariable(value = "pageNum") int pageNum,@PathVariable(value = "goodid") Integer goodid,@PathVariable(value = "goodamount") Integer goodamount){


        request.setAttribute("goodid",goodid);
        request.setAttribute("goodamount",goodamount);

        System.out.println("goodid=" + goodid);
        System.out.println("goodamount=" + goodamount);
        String goodid2 = request.getParameter("goodid");
        // System.out.println(23);
        List<Shelf> list = null;
        PageInfo<Shelf> pageInfo = null;
        if (goodid2 != null && goodid2!="") {
            Integer gid = Integer.parseInt(goodid2);
            PageHelper.startPage(pageNum, 5);
            list = mrbService.selectAllByGoodid(gid);
            pageInfo = new PageInfo<>(list);
        } else {
            //分页1
            PageHelper.startPage(pageNum, 5);
            list = mrbService.selAllShelf(shelf);
            pageInfo = new PageInfo<>(list);
        }

        request.setAttribute("pageInfo", pageInfo);
        request.setAttribute("shelfList", list);
        return "mrb/mrboperation";
    }


    //生成退货单
    @RequestMapping("/mrblist")
    public String mrblist(HttpServletRequest request) {


        System.out.println("111111111111111111111111111111111111111111111111");
//        String userId =(String) request.getSession().getAttribute("userId");
//        System.out.println("userId="+userId);
//
//        MrbClient mc = new MrbClient();
//        List<HashMap<String,String>> list = mc.get();
//        Mrb m =new Mrb();
//        for(HashMap<String,String> stringStringHashMap:list){
//           m.setId(Integer.parseInt(stringStringHashMap.get("id")));
//
//        }
//    }
//
//        for (HashMap<String, String> stringStringHashMap:list){
//            ckd.setOutnum(Integer.parseInt(stringStringHashMap.get("quantity")));
//            ckd.setAddress(stringStringHashMap.get("address"));
//            ckd.setUname(stringStringHashMap.get("uname"));
//            ckd.setOrderid(Integer.parseInt(stringStringHashMap.get("orderid")));
//            ckd.setGoodid(Integer.parseInt(stringStringHashMap.get("goodsid")));
//            ckd.setTel(stringStringHashMap.get("15656233652"));
////            ckd.setUserid(Integer.parseInt(userId));
//
//            chuKuService.insertChuKuDanByDingDan(ckd);
//        }

        return "redirect:selAllMrb";
    }


}





