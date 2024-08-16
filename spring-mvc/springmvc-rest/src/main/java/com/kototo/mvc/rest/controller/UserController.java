package com.kototo.mvc.rest.controller;

import com.kototo.mvc.rest.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String findByPage(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                             @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        System.out.println("pageIndex = " + pageIndex + ", pageSize = " + pageSize);
        return "findByPage OK!";
    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        System.out.println("user = " + user);
        return "saveUser OK!";
    }

    @GetMapping("/{id}")
    public String findUserById(@PathVariable Integer id) {
        System.out.println("id = " + id);
        return "findUserById OK!";
    }

    @PutMapping
    public String changeUser(@RequestBody User user) {
        System.out.println("user = " + user);
        return "changeUser OK!";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        System.out.println("id = " + id);
        return "deleteUser OK!";
    }

    @GetMapping("/like")
    public String findLike(@RequestParam(required = false, defaultValue = "all") String keyword,
                           @RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                           @RequestParam(required = false,defaultValue = "10") Integer pageSize) {
        System.out.println("keyword = " + keyword + ", pageIndex = " + pageIndex + ", pageSize = " + pageSize);
        return "findLike OK!";
    }
}
