package com.kototo.mvc.ex.controller;

import com.kototo.mvc.ex.pojo.Product;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/check")
    public String check(@Validated Product product) {
        return "ok";
    }
}
