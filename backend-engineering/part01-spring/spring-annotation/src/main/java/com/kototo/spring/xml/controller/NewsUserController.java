package com.kototo.spring.xml.controller;

import com.kototo.spring.xml.service.NewsUserService;

public class NewsUserController {
    private NewsUserService newsUserService;

    public void setNewsUserService(NewsUserService newsUserService) {
        this.newsUserService = newsUserService;
    }

    public void showAllUser() {
        System.out.println("NewsUserController");
        newsUserService.showAllUser();
    }
}
