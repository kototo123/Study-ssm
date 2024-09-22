package com.kototo.mybatis.service.impl;

import com.kototo.mybatis.mapper.EmployeeMapper;
import com.kototo.mybatis.pojo.Employee;
import com.kototo.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    @Transactional(readOnly = true)
    public List<Employee> showAll() {
        return employeeMapper.selectAllEmp();
    }
}
