package com.kototo.spring.allAnno.dao.impl;

import com.kototo.spring.allAnno.dao.NewsUserDao;
import org.springframework.stereotype.Repository;

@Repository
public class NewsUserDaoImpl implements NewsUserDao {
    @Override
    public void selectUser() {
        System.out.println("NewsUserDaoImpl");
    }
}
