package com.kototo.spring.xml.test;

import com.kototo.spring.anno.controller.NewsUserController;
import com.kototo.spring.anno.dao.NewsUserDao;
import com.kototo.spring.anno.dao.impl.NewsUserDaoImpl;
import com.kototo.spring.anno.service.NewsUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnoTest {
    @Test
    public void testAnno() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-anno.xml");
        NewsUserController newsUserController = ioc.getBean(NewsUserController.class);
        newsUserController.showAllUser();
    }
}
