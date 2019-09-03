package com.ccc.demoboot.controller;

import com.ccc.demoboot.common.Compagesize;
import com.ccc.demoboot.domain.Emp;
import com.ccc.demoboot.domain.EmpWork;
import com.ccc.demoboot.service.EmpService;
import com.ccc.demoboot.service.EmpWorkService;
import com.ccc.demoboot.service.WorkService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class
EmpController {

    @Resource(name = "empServiceImpl")
    EmpService empService;

    @Resource(name = "workServiceImpl")

    WorkService workService;

    @Resource(name = "empWorkServiceImpl")
    EmpWorkService empWorkService;

    @RequestMapping(value ="selAllempandwork/{pagenum}")
    public String selAllEmpAndWork(HttpServletRequest request , Emp emp, @PathVariable(value = "pagenum") int pagenum){

        String empname= request.getParameter("empname");

        int pagesize=new Compagesize().getPagesize();
        PageHelper.startPage(pagenum,pagesize);
        List<Emp> emps= empService.selectAllEmpAndwork(emp);
        PageInfo pageInfo=new PageInfo(emps);
        request.setAttribute("pageinfo", pageInfo);
        request.setAttribute("emps",emps);
        return "/emptj/emp";
    }

    @RequestMapping(value = "deleteempbyId")
    public String deleteEmpById(@RequestParam(value = "id")int id){
        empWorkService.deleteEmpById(id);

          return "redirect:selAllempandwork/1 ";
}

        @RequestMapping(value = "/addEmp")
        public String addEmp(EmpWork empWork){
           return "/emptj/add";
        }

    @RequestMapping(value = "/addEmpview")
    public String addEmpview(Emp emp, HttpServletRequest request){

        empService.InsertEmp(emp);
        return "redirect:selAllempandwork/1 ";
    }










    @RequestMapping(value="/tubiao")
    public String tubiao(){

        return "/emptj/tubiao";
    }

}
