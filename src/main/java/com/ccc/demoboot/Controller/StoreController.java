package com.ccc.demoboot.Controller;

import com.ccc.demoboot.domain.RuKuDan;
import com.ccc.demoboot.service.RukuDanService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/store")
public class StoreController {

    @Resource(name = "rukuDanServiceImpl")
    RukuDanService rukuDanService;

    @RequestMapping("/main")
    public String main(){
        return "store/main";
    }
    @RequestMapping("/nav")
    public String nav(){
        return "store/nav";
    }

    @RequestMapping("/storeList")
    public String storeList(HttpServletRequest request,Model model){
        List<RuKuDan> ruKuDanList = rukuDanService.selectByAll();
        request.setAttribute("ruKuDanList",ruKuDanList);
        return "store/storeList";
    }

    @RequestMapping(value = "/detail/{id}")
    public String storeDetail(HttpServletRequest request,Model model,@PathVariable(value = "id") Integer id){
        RuKuDan ruKuDan = rukuDanService.selectById(id);
        request.setAttribute("ruKuDan",ruKuDan);
        return "store/storeDetail";
    }

//    @RequestMapping("/selectById/${id}")
//    public String selectById(HttpServletRequest request, Model model, @PathVariable(value = "id" )Integer id){
//        return "store/storeList";
//    }

}

