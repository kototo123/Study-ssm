package com.kototo.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.kototo.spring.pojo.HappyComponent;
import com.kototo.spring.pojo.HappyMachine;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring01Test2 {
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
    @Test
    public void testIOCGetBean() throws Exception {
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("spring-07.xml");

        HappyMachine happyMachine = ioc.getBean("happyMachine", HappyMachine.class);
        System.out.println("happyMachine = " + happyMachine);
    }
}
