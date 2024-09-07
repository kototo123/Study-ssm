package com.kototo.mvc.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inter")
public class TargetController {

    @GetMapping("/method")
    public String method() {
        System.out.println("target方法执行了");
        return "ok";
    }
}
