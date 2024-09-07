package com.kototo.mybatis.more.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private Integer tId;
    private String tName;

    private List<Student> studentList;
}
