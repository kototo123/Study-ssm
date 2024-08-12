package com.kototo.spring.anno.service.impl;

import com.kototo.spring.anno.service.NewsUserService;
import org.springframework.stereotype.Service;

@Service
public class NewsUserServicePlusImpl implements NewsUserService {
    @Override
    public void showAllUser() {
        System.out.println("newsuserserviceshengjile");
    }
}
