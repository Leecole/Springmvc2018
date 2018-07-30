package com.oracle.springmvc.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("UserControl")
public class UserController {

    @RequestMapping("/login")
    public String login() {
        System.out.println("login method~~~");
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        System.out.println("index method~~~~");
        return "index";
    }

    @RequestMapping("/main")
    public String  main(){
        System.out.println("这是main方法");
        return "main";
    }
}

