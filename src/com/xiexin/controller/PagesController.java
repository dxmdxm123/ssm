package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 该控制类 是为了 查找jsp 或者 带参数访问jsp 或者跳转的
* */
@Controller
@RequestMapping("/pages")
public class PagesController {
    @RequestMapping("/reg")
    public String reg() {
        //System.out.println("请求注册进入hello。。");
        return "reg";
    }

    @RequestMapping("/regForm") //   // 127.0.0.1:8080/pages/login
    public String regForm(){
        return "regForm";
    }

    @RequestMapping("/login")   //   // 127.0.0.1:8080/pages/login
    public String login(){
        return "login";
    }

    @RequestMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @RequestMapping("/ajaxCommit")
    public String ajaxCommit(){
        return "ajaxCommit";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
