package com.kototo.mvc.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("private/resource")
public class PrivateController {
    
    @GetMapping("one")
    public Object one(){
        return "private one";
    }
    
    @GetMapping("two")
    public Object two(){
        return "private two";
    }

    @GetMapping("three")
    public Object three(){
        return "private two";
    }

}
