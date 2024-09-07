package com.kototo.mybatis.other.mapper;


import com.kototo.mybatis.other.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectEmp();

    Integer insertEmp();

    List<Employee> selectEmpa();
}
