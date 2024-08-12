package com.kototo.spring.xml.test;

import com.kototo.spring.allAnno.config.SpringConfig;
import com.kototo.spring.allAnno.pojo.NewsUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = SpringConfig.class)
public class SpringTest {

    @Autowired
    NewsUser nu;

    @Test
    public void test() {
        System.out.println("nu = " + nu);
    }
}
