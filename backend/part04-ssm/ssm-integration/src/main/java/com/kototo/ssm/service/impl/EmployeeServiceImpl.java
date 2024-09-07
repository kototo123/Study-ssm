package com.kototo.ssm.service.impl;

import com.kototo.ssm.mapper.EmployeeMapper;
import com.kototo.ssm.pojo.Employee;
import com.kototo.ssm.service.EmployeeService;
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
    public List<Employee> showAllEmp() {
        return employeeMapper.selectAllEmp();
    }
}
