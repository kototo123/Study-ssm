package com.kototo.schedule.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kototo.schedule.mapper.ScheduleMapper;
import com.kototo.schedule.pojo.Schedule;
import com.kototo.schedule.service.ScheduleService;
import com.kototo.schedule.util.PageBean;
import com.kototo.schedule.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    @Transactional(readOnly = true)
    public R showAllByPage(Integer pageSize, Integer currentPage) {
        //开启分页
        PageHelper.startPage(currentPage, pageSize);
        //调用查询所有
        List<Schedule> scheduleList = scheduleMapper.selectAllByPage();
        //封装PageInfo
        PageInfo<Schedule> pageInfo = new PageInfo<>(scheduleList);
        //封装给前端的PageBean
        PageBean<Schedule> pageBean = new PageBean<Schedule>(currentPage,
                pageSize,
                pageInfo.getTotal(),
                pageInfo.getList());

        R ok = R.ok(pageBean);
        return ok;
    }

    @Override
    public R add(Schedule schedule) {
        Integer insertSchedule = scheduleMapper.insertSchedule(schedule);
        if(insertSchedule > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R change(Schedule schedule) {
        Integer updateSchedule = scheduleMapper.updateSchedule(schedule);
        if(updateSchedule > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }

    @Override
    public R remove(Integer id) {
        Integer deleteSchedule = scheduleMapper.deleteSchedule(id);
        if(deleteSchedule > 0) {
            return R.ok(null);
        }
        return R.fail(null);
    }
}
