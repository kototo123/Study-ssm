package com.kototo.spring.aop.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.kototo.spring.aop.anno")
@EnableAspectJAutoProxy
public class SpringConfig {
}
