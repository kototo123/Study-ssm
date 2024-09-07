package com.kototo.mvc.resttest.controller;

import com.kototo.mvc.resttest.pojo.Schedule;
import com.kototo.mvc.resttest.service.ScheduleService;
import com.kototo.mvc.resttest.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@CrossOrigin
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public R findAll() {
        List<Schedule> scheduleList = scheduleService.getAll();

        R r = R.ok(scheduleList);
        return r;
    }

    @PostMapping
    public R saveSchedule(@RequestBody Schedule schedule) {
        scheduleService.saveSchedule(schedule);
        return R.ok(null);
    }

    @PutMapping
    public R updateSchedule(@RequestBody Schedule schedule) {
        scheduleService.updateSchedule(schedule);
        return R.ok(null);
    }

    @DeleteMapping("/{id}")
    public R deleteSchedule(@PathVariable Integer id) {
        scheduleService.removeById(id);
        return R.ok(null);
    }

}
