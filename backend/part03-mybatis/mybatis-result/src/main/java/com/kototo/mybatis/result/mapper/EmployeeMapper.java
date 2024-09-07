package com.kototo.mybatis.result.mapper;


import com.kototo.mybatis.result.pojo.Employee;

import java.util.Map;

public interface EmployeeMapper {
    Integer selectEmpCount();
    Double selectMaxSalary();

    Employee selectEmpBySalary(Double empSalary);

    Map<String, Object> selectSalary();

    Integer insertEmp(Employee employee);

    Employee selectEmp(Integer empId);
}
