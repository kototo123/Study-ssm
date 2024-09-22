package com.kototo.controller;

import com.kototo.config.DataSourceConfig;
import com.kototo.config.MultiDataSourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    @Autowired
//    private DataSourceConfig dataSourceConfig;
    @Autowired
    private MultiDataSourceConfig multiDataSourceConfig;

    @GetMapping("/test")
    public String test() {
        System.out.println(multiDataSourceConfig);
        return "JJJJ";
    }
}
