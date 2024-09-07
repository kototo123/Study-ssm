package com.kototo.ssm.controller;

import com.kototo.ssm.pojo.Employee;
import com.kototo.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> showList() {
        List<Employee> employeeList = employeeService.showAllEmp();
        return employeeList;
    }
}