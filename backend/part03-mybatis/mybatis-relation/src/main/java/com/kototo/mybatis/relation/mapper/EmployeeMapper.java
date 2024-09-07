package com.kototo.mybatis.relation.mapper;

import com.kototo.mybatis.relation.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    Employee selectEmpAndDeptId(Integer empId);
}
