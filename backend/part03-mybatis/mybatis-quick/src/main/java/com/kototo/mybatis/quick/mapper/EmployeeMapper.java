package com.kototo.mybatis.quick.mapper;


import com.kototo.mybatis.quick.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAllEmp();

    Employee selectEmpById(Integer empId);

    Integer insertEmp(Employee employee);

    Integer updateEmp(Employee employee);

    Integer deleteEmp(Integer empId);
}
