package com.kototo.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class LogAspect {

    public void printCut() {}

//    @Before("printCut()")
    public void beforeLog(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("AOP的前置通知 方法" + joinPoint.getSignature().getName() + "参数" + Arrays.toString(args));
    }

//    @AfterReturning(value = "printCut()", returning = "result")
    public void afterReturningLog(JoinPoint joinPoint, Object result) {
        System.out.println("AOP的返回通知 " + joinPoint.getSignature().getName() + result);
    }

//    @AfterThrowing(value = "printCut()", throwing = "ex")
    public void prirntLogAfterException(JoinPoint joinPoint, Exception ex) {
        System.out.println("[AOP异常通知] 方法抛异常了 "+ joinPoint.getSignature().getName() + ex.getMessage());
    }

//    @After(value = "printCut()")
    public void printLogFinallyEnd() {
        System.out.println("[AOP后置通知] 方法最终结束了");
    }

    public Object aroundLog(ProceedingJoinPoint point) {
        Object[] args = point.getArgs();
        System.out.println("AOP的前置通知 方法" + point.getSignature().getName() + "参数" + Arrays.toString(args));
        Object result = null;
        try {
            result = point.proceed();
            System.out.println("AOP的返回通知 " + point.getSignature().getName() + result);
        } catch (Throwable e) {
            System.out.println("[AOP异常通知] 方法抛异常了 "+ point.getSignature().getName() + e.getMessage());
        } finally {
            System.out.println("[AOP后置通知] 方法最终结束了");
        }
        return result;
    }
}
