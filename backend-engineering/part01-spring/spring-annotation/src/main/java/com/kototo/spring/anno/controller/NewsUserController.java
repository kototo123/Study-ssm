package com.kototo.spring.anno.controller;

import com.kototo.spring.anno.service.NewsUserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class NewsUserController {
//    @Autowired
//    @Qualifier("newsUserServiceImpl")
    @Resource(name = "newsUserServicePlusImpl")
    private NewsUserService newsUserService;

    public void showAllUser() {
        System.out.println("NewsUserController");
        newsUserService.showAllUser();
    }
}
