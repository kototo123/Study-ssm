package com.kototo.mvc.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex")
public class GlobalController {

    @GetMapping("/arith")
    public String testExAi() {
        System.out.println("123");
        int i = 10/0;
        return "arith";
    }

    @GetMapping("/null")
    public String testExNull() {
        System.out.println("456");
        String s = null;
        s.length();
        return "null";
    }

    @GetMapping("/other")
    public String testOther() {
        System.out.println("789");
        Object o = new Object();
        Integer i = (Integer) o;
        return "other0";
    }

}
