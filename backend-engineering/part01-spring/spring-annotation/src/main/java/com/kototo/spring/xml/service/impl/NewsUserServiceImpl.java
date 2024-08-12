package com.kototo.spring.xml.service.impl;

import com.kototo.spring.xml.dao.NewsUserDao;
import com.kototo.spring.xml.service.NewsUserService;

public class NewsUserServiceImpl implements NewsUserService {
    private NewsUserDao newsUserDao;

    public void setNewsUserDao(NewsUserDao newsUserDao) {
        this.newsUserDao = newsUserDao;
    }

    @Override
    public void showAllUser() {
        System.out.println("NewsUserServiceImpl");
        newsUserDao.selectUser();
    }
}
