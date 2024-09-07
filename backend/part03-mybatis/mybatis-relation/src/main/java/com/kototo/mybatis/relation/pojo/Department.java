package com.kototo.mybatis.relation.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Integer deptId;
    private String deptName;

    private List<Employee> employeeList;
}
