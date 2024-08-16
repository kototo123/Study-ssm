package com.kototo.mvc.resp.controller;

import com.kototo.mvc.resp.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/json")
public class JsonController {

    @PostMapping("/user")
    public User getJson(@RequestBody User user) {
        System.out.println("user = " + user);
        User user1 = new User("kototo","12312313213213");
        return user1;
    }
}
