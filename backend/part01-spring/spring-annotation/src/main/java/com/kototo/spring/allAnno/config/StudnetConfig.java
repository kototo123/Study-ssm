package com.kototo.spring.allAnno.config;

import com.kototo.spring.allAnno.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudnetConfig {
    @Bean
    public Student student() {
        return new Student("kototo",16);
    }
}
