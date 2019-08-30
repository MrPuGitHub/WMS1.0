package com.ccc.demoboot.Controller;

import com.ccc.demoboot.common.Compagesize;
import com.ccc.demoboot.domain.Emp;
import com.ccc.demoboot.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EmpController {

    @Resource(name = "empServiceImpl")
    EmpService empService;

    @RequestMapping(value ="selAllempandwork/{pagenum}")
    public String selAllEmpAndWork(HttpServletRequest request , Emp emp, @PathVariable(value = "pagenum") int pagenum){

        String empname= request.getParameter("empname");
        System.out.println(empname);
        int pagesize=new Compagesize().getPagesize();
        PageHelper.startPage(pagenum,pagesize);
        List<Emp> emps= empService.selectAllEmpAndwork(emp);
        PageInfo pageInfo=new PageInfo(emps);
        request.setAttribute("pageinfo", pageInfo);
        request.setAttribute("emps",emps);
        return "/emptj/emp";
    }

    @RequestMapping(value="/tubiao")
    public String tubiao(){

        return "/emptj/tubiao";
    }

}
