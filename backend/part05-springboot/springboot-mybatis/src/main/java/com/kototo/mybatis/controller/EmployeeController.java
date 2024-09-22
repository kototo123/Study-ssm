package com.kototo.mybatis.controller;

import com.kototo.mybatis.pojo.Employee;
import com.kototo.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emps")
    public List<Employee> showAll() {
        return employeeService.showAll();
    }
}
