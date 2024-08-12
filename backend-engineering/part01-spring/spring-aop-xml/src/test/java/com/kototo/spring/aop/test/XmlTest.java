package com.kototo.spring.aop.test;

import com.kototo.spring.aop.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:spring-xml.xml")
public class XmlTest {
    @Autowired
    private Calculator calculator;

    @Test
    public void test() {
        calculator.add(23,24);
    }
}
