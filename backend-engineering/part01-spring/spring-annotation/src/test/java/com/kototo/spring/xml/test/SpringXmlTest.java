package com.kototo.spring.xml.test;

import com.kototo.spring.xml.controller.NewsUserController;
import com.kototo.spring.xml.dao.NewsUserDao;
import com.kototo.spring.xml.pojo.NewsUser;
import com.kototo.spring.xml.service.NewsUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlTest {
    @Test
    public void testXml() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
        NewsUser bean = ioc.getBean(NewsUser.class);
        System.out.println("bean = " + bean);
    }
    @Test
    public void testThreeLayel() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");

        NewsUserController newsUserController = ioc.getBean(NewsUserController.class);
        newsUserController.showAllUser();
    }
}
