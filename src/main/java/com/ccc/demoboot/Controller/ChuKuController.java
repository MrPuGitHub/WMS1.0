package com.ccc.demoboot.Controller;


import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.service.ChuKuService;
import com.github.pagehelper.PageHelper;
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

    @RequestMapping("/chuku/{pageNum}")
    public String chuku(HttpServletRequest request, @PathVariable(value="pageNum") Integer pageNum){

        PageHelper.startPage(pageNum, 5);

        List<ChuKuDan> chuKuDanList = chuKuService.selAllChuKuDan();


        ChuKuDan c = chuKuDanList.get(2);
        Date outtime = c.getOuttime();
        System.out.println(outtime.getYear()+"年"+outtime.getMonth()+"月"+outtime.getDay());

        request.setAttribute("chuKuDanList",chuKuDanList);

        return "/view/ChuKu/chuku.jsp";
    }


}
