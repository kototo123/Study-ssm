package com.kototo.mvc.param.controller;

import com.kototo.mvc.param.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/param")
public class ParamController {

    @GetMapping("/data")
    @ResponseBody
    public String getData(String username,String password) {
        System.out.println("username = " + username + ", password = " + password);
        return "ok1";
    }

    @GetMapping("/reqdata")
    @ResponseBody
    public String getRequestData(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("username = " + username + ", password = " + password);
        return "ok2";
    }

    @GetMapping("/list")
    @ResponseBody
    public String getList(@RequestParam("hobbies") List<String> hobbies) {
        hobbies.forEach(System.out::println);
        return "ok3";
    }

    @GetMapping("/pojo")
    @ResponseBody
    public String getPojo(User user) {
        System.out.println("user = " + user);
        return "ok4";
    }
}
