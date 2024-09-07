package com.kototo.schedule.mapper;

import com.kototo.schedule.pojo.Schedule;

import java.util.List;

public interface ScheduleMapper {

    List<Schedule> selectAllByPage();

    Integer insertSchedule(Schedule schedule);

    Integer updateSchedule(Schedule schedule);

    Integer deleteSchedule(Integer id);
}
