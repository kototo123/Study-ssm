package com.kototo.starter.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({RobotAutoConfiguration.class})
public @interface EnableRobot {
}
