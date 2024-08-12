package com.kototo.spring.aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class ValidateAspect {
    @Before("com.kototo.spring.aop.anno.LogAspect.printCut()")
    public void checkNum() {
        System.out.println("Validate");
    }
}
