package com.ccc.demoboot.controller;

import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.service.ChuKuService;
import com.ccc.demoboot.toCaiGou.ChuKuDanToCaiGou;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ChuKuController {

    @Resource(name = "chuKuServiceImpl")
    private ChuKuService chuKuService;


    //    出库列表页面
//    md代表查询方式
    @RequestMapping("/chuku/{pageNum}/{md}")
    public String chuku(HttpServletRequest request, @PathVariable(value = "pageNum") Integer pageNum, @PathVariable(value = "md") String md) {

        if (pageNum <= 0) {
            pageNum = 1;
        }
        System.out.println("md=" + md);

        List<ChuKuDan> chuKuDanList = null;

        switch (md) {
            case "all":
                PageHelper.startPage(pageNum, 5);
                chuKuDanList = chuKuService.selAllChuKuDan();
                break;
            case "week":
                PageHelper.startPage(pageNum, 5);
                chuKuDanList = chuKuService.selChuKuDanInWeek();
                break;
            case "month":
                PageHelper.startPage(pageNum, 5);
                chuKuDanList = chuKuService.selChuKuDanInMonth();
                break;
            case "quarter":
                PageHelper.startPage(pageNum, 5);
                chuKuDanList = chuKuService.selChuKuDanInQuarter();
                break;
            case "selAllByTiaoJian":
                String cid = request.getParameter("faHuoDanHao");
                Integer chukuid = null;
                if (cid != null && cid != "") {
                    chukuid = Integer.parseInt(cid);
                }

                String state = request.getParameter("zhuangTai");
                String startTime = request.getParameter("startTime");
                String endTime = request.getParameter("endTime");
                System.out.println("chukuid=" + chukuid);
                System.out.println("state=" + state);
                System.out.println("startTime=" + startTime);
                System.out.println("endTime=" + endTime);
                PageHelper.startPage(pageNum, 5);
                chuKuDanList = chuKuService.selChuKuDanByTiaoJian(chukuid, state, startTime, endTime);
                break;
        }
        PageInfo<ChuKuDan> pageInfo = new PageInfo<>(chuKuDanList);

        request.setAttribute("chuKuDanList", chuKuDanList);
        request.setAttribute("pageInfo", pageInfo);

        return "ChuKu/chuku";
    }


    //给采购管理提供的方法
    //返回出库单对象集合
    @ResponseBody
    @RequestMapping("/selAllChuKuDan")
    public List<ChuKuDanToCaiGou> selAllChuKuDan() {

        List<ChuKuDanToCaiGou> listc = new ArrayList<>();
        List<ChuKuDan> list = chuKuService.selAllToCaiGou();
        for (ChuKuDan c : list) {
            ChuKuDanToCaiGou ckd = new ChuKuDanToCaiGou();
            ckd.setGoodid(c.getGoodid());
            ckd.setGoodnum(c.getOutnum());
            listc.add(ckd);
        }

        return listc;

    }


}
