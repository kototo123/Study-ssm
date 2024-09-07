package com.kototo.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class ValidateAspect {
    public void checkNum() {
        System.out.println("Validate");
    }
}
