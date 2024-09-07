package com.kototo.mybatis.dynamic.mapper;

import com.kototo.mybatis.dynamic.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    List<Employee> selectEmpByCondition(Map<String, Object> condition);

    Integer updateByCondition(Map<String, Object> condition);

    List<Employee> selectEmpByTrimCondition(Map<String, Object> condition);

    List<Employee> selectEmpByChoose(Map<String, Object> condition);

    List<Employee> selectEmpByForeach(List<Integer> ids);

    Integer insertEmpByBatch(List<Employee> employeeList);

    Integer updateEmpByBatch(List<Employee> employeeList);

}
