package com.kototo.mybatis.param.mapper;

import com.kototo.mybatis.param.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    List<Employee> selectAll();

    Employee selectEmpById(Integer empId);
    Employee selectEmpById2(Integer empId);

    List<Employee> selectAllOrder(String rules);

    Integer insertEmp(Employee employee);

    List<Employee> selectEmpByNameAndSalary(@Param("empName") String empName, @Param("empSalary") Double empSalary);

    List<Employee> selectEmpByMap(Map<String, Object> map);
}
