package com.kototo.schedule.service;


import com.kototo.schedule.pojo.Schedule;
import com.kototo.schedule.util.R;

import java.util.List;

public interface ScheduleService {
    R showAllByPage(Integer pageSize, Integer currentPage);

    R add(Schedule schedule);

    R change(Schedule schedule);

    R remove(Integer id);
}
