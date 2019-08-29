package com.ccc.demoboot.Controller;


import com.ccc.demoboot.domain.User;
import com.ccc.demoboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
public class LoginController {

    @Resource(name = "userServiceImpl")
    UserService userService;

    @RequestMapping(value = "/login")
    public String Login() {


        return "/view/shouye/login";
    }

    @RequestMapping(value = "/checkLogin")
    public String checkLogin(HttpServletRequest request, User us) {

        Integer userId = us.getId();
        request.getSession().setAttribute("userId",userId);
        request.getSession().removeAttribute("ms");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        System.out.println(name + "\t" + password);
        User user = userService.checkLogin(name, password);
        System.out.println(user);
        if (user != null) {
            request.setAttribute("user", user);
            System.out.println("登陆成功");
            return "/view/shouye/first";
        } else {
            request.getSession().setAttribute("ms", "用户名或密码错误");
        }
        return "/view/shouye/login";
    }


    @RequestMapping(value = "tupian")
    public String tupian() {


        return "zhaopian";
    }

    @RequestMapping(value = "top")
    public String top() {

        return "/view/shouye/top";
    }


    @RequestMapping(value = "/menu")
    public String menu() {


        return "/view/shouye/menu";
    }

    @RequestMapping(value = "right")
    public String right() {

        return "/view/shouye/right";
    }


//    @RequestMapping(value = "seloneUser")
//    public String selOneUser(User user,HttpServletRequest request){
//        User us = userService.selOneUser(user);
//        request.setAttribute("us",us);
//        return "user";
//    }
}
