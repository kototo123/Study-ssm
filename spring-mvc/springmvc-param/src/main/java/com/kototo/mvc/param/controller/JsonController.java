package com.kototo.mvc.param.controller;

import com.kototo.mvc.param.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/json")
public class JsonController {

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestBody User user) {
        System.out.println("user = " + user);
        return "ok";
    }
}
