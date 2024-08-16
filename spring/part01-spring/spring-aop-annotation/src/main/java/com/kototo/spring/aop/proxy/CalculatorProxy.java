package com.kototo.spring.aop.proxy;

public class CalculatorProxy implements Calculator{

    private Calculator calculator;

    public CalculatorProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int i, int j) {
        System.out.println("日志,add方法执行了,参数"+i+"+"+j);

        int result = calculator.add(i,j);
        System.out.println("日志,add方法执行结束,结果为"+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
