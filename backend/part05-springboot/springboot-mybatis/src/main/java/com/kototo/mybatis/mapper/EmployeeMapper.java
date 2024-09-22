package com.kototo.mybatis.mapper;

import com.kototo.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAllEmp();
}
