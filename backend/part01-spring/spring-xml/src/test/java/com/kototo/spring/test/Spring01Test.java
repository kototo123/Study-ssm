package com.kototo.spring.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring01Test {
    @Test
    public void testCreatIOC() {
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-01.xml");

        ClassPathXmlApplicationContext ioc2 =
                new ClassPathXmlApplicationContext();
        ioc2.setConfigLocation("spring-01.xml");
        ioc2.refresh();

        System.out.println(ioc);
        System.out.println(ioc2);

    }
}
