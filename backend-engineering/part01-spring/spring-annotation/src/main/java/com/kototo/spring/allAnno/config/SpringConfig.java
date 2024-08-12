package com.kototo.spring.allAnno.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.kototo.spring.allAnno.pojo.NewsUser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.kototo.spring.allAnno")
@PropertySource({"classpath:config.properties","classpath:jdbc.properties"})
@Import(StudnetConfig.class)
public class SpringConfig {
//    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;

    @Bean
    public DruidDataSource dataSource(@Value("${jdbc.driverClassName}") String driverClassName,
                                      @Value("${jdbc.url}") String url,
                                      @Value("${jdbc.username}") String username,
                                      @Value("${jdbc.password}") String password) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "nu", initMethod = "init", destroyMethod = "destory")
    public NewsUser getNewsUser() {
        return new NewsUser();
    }
}
