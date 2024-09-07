package com.kototo.ssm.mapper;

import com.kototo.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> selectAllEmp();
}
