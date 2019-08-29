package com.ccc.demoboot.controller;


import com.ccc.demoboot.domain.User;
import com.ccc.demoboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class LoginController {

    @Resource(name = "userServiceImpl")
    UserService userService;

    @RequestMapping(value = "/login")
    public String Login(String name,String password){


        return "login";
    }

    @RequestMapping(value = "/checkLogin")
    public String checkLogin(HttpServletRequest request, User us, HttpServletResponse response){

        request.getSession().removeAttribute("ms");
       String name =request.getParameter("name");
       String password= request.getParameter("password");
        System.out.println(name+"\t"+password);
        User user=userService.checkLogin(us.getUsername(),us.getPassword());
        System.out.println(user);
        if(us!=null) {
            request.setAttribute("user", user);
            System.out.println("登陆成功");
            return "first";
        }else{
           request.getSession().setAttribute("ms","用户名或密码错误");
        }
        return"login";
    }



    @RequestMapping(value = "tupian")
    public String tupian(){


        return "zhaopian";
    }

    @RequestMapping(value = "top")
    public String top(){

        return "top";
    }


    @RequestMapping(value = "/menu")
    public String menu(){


        return "menu";
    }

    @RequestMapping(value = "right")
    public String right(){

        return "right";
    }


//    @RequestMapping(value = "seloneUser")
//    public String selOneUser(User user,HttpServletRequest request){
//        User us = userService.selOneUser(user);
//        request.setAttribute("us",us);
//        return "user";
//    }
}
