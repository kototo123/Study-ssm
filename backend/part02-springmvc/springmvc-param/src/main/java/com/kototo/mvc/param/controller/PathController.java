package com.kototo.mvc.param.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/path")
public class PathController {

    @GetMapping("/findid")
    @ResponseBody
    public String showId(@RequestParam("id") Integer id) {
        System.out.println("id = " + id);
        return "ok1";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String showIdByPath(@PathVariable("id") Integer id) {
        System.out.println("id = " + id);
        return "ok2";
    }

    @GetMapping("/{id}/{name}/{age}")
    @ResponseBody
    public String showMoreData(@PathVariable Integer id, @PathVariable String name, @PathVariable Integer age) {
        System.out.println("id = " + id + ", name = " + name + ", age = " + age);
        return "ok3";
    }

}
