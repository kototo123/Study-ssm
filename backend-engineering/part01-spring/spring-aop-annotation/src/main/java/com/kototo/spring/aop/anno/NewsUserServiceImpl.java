package com.kototo.spring.aop.anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class NewsUserServiceImpl {

    public void showAll(int a, int b) {
        System.out.println("新用户添加");
    }
}
