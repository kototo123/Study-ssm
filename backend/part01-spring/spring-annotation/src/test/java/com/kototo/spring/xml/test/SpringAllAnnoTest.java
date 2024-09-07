package com.kototo.spring.xml.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.kototo.spring.allAnno.config.BaseConfig;
import com.kototo.spring.allAnno.config.SpringConfig;
import com.kototo.spring.allAnno.config.StudnetConfig;
import com.kototo.spring.allAnno.controller.NewsUserController;
import com.kototo.spring.allAnno.pojo.NewsUser;
import com.kototo.spring.allAnno.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class SpringAllAnnoTest {
    @Test
    public void testAllanno()  throws SQLException {
        AnnotationConfigApplicationContext ioc =
                new AnnotationConfigApplicationContext(SpringConfig.class);

//        NewsUserController newsUserController = ioc.getBean(NewsUserController.class);
//        newsUserController.showAllUser();

//        BaseConfig baseConfig = ioc.getBean(BaseConfig.class);
//        System.out.println("baseConfig = " + baseConfig);
//
//        DruidDataSource dataSource = ioc.getBean("dataSource",DruidDataSource.class);
//        System.out.println("dataSource = " + dataSource);
//        DruidPooledConnection connection = dataSource.getConnection();
//        System.out.println("connection = " + connection);
//
//        NewsUser nu = ioc.getBean("nu", NewsUser.class);
//        System.out.println("nu = " + nu);

//        Student student = ioc.getBean(Student.class);
//        System.out.println("student = " + student);

        NewsUser user1 = ioc.getBean("user1", NewsUser.class);
        System.out.println("user1 = " + user1);

        NewsUser user2 = ioc.getBean("user2", NewsUser.class);
        System.out.println("user2 = " + user2);

        ioc.close();
    }
}
