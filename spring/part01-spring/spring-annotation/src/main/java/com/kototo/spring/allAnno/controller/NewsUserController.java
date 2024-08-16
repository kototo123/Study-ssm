package com.kototo.spring.allAnno.controller;

import com.kototo.spring.allAnno.service.NewsUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NewsUserController {
    @Autowired
    private NewsUserService newsUserService;

    public void showAllUser() {
        System.out.println("ALlanno");
        System.out.println("NewsUserController");
        newsUserService.showAllUser();
    }
}
