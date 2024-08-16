package com.kototo.spring.aop.anno;

import org.springframework.stereotype.Component;


@Component
public class CalculatorPureImpl implements Calculator {

    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("add执行了");
//        int a = 10/0;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("sub执行了");
        return result;
    }

    @Override
    public int mul(int i, int j) {

        int result = i * j;
        System.out.println("mul执行了");

        return result;
    }

    @Override
    public int div(int i, int j) {

        int result = i / j;
        System.out.println("div执行了");

        return result;
    }
}