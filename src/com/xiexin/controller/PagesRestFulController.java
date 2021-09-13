package com.xiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/pagesRest")
public class PagesRestFulController {
    // 127.0.0.1:8080/pagesRest/login
    // 127.0.0.1:8080/pagesRest/{path}
    @RequestMapping("/{path}")
    public String path(@PathVariable("path") String path){
        System.out.println("path = " + path);
        return path;
    }
}
