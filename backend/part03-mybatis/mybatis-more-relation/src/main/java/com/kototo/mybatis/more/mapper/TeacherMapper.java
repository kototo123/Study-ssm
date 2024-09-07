package com.kototo.mybatis.more.mapper;

import com.kototo.mybatis.more.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectAllTeacher();
}
