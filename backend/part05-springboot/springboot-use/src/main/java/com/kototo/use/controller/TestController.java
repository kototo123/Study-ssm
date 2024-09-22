package com.kototo.use.controller;

import com.kototo.starter.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RobotService robotService;

    @GetMapping("/test")
    public String test() {
        String s = robotService.sayHello();
        System.out.println(s);
        return "OK";
    }
}
