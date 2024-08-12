package com.kototo.spring.anno.service.impl;

import com.kototo.spring.anno.dao.NewsUserDao;
import com.kototo.spring.anno.service.NewsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsUserServiceImpl implements NewsUserService {
    @Autowired
    private NewsUserDao newsUserDao;

    @Override
    public void showAllUser() {
        System.out.println("NewsUserServiceImpl");
        newsUserDao.selectUser();
    }
}
