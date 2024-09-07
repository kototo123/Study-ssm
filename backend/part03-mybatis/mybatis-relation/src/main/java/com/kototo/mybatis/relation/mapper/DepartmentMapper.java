package com.kototo.mybatis.relation.mapper;

import com.kototo.mybatis.relation.pojo.Department;

public interface DepartmentMapper {
    Department selectDeptAndEmpsById(Integer deptId);
}
