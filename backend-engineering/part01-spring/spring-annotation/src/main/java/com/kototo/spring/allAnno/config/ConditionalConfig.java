package com.kototo.spring.allAnno.config;

import com.kototo.spring.allAnno.pojo.NewsUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {
    @Bean
    public NewsUser user1() {
        return new NewsUser("kotutu", "123");
    }

    @Bean
    @Conditional(MyCondition.class)
    public NewsUser user2() {
        return new NewsUser("kototo","456");
    }
}
