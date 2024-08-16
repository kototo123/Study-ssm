package com.kototo.mvc.ex.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/resource")
public class PublicController {
    /**
     * 模拟登录,将假用户数据存储到session中!
     */
    @GetMapping("login")
    public Object login(HttpSession session){
        session.setAttribute("user","root");
        return "login success!!";
    }

    @GetMapping("one")
    public Object one(){
        return "public one";
    }

    @GetMapping("two")
    public Object two(){
        return "public two";
    }
}
