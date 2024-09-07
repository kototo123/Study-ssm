package com.kototo.schedule.controller;

import com.kototo.schedule.pojo.Schedule;
import com.kototo.schedule.service.ScheduleService;
import com.kototo.schedule.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schedule")
@CrossOrigin
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/{pageSize}/{currentPage}")
    private R showList(@PathVariable Integer pageSize, @PathVariable Integer currentPage) {
        R r = scheduleService.showAllByPage(pageSize, currentPage);
        return r;
    }

    @PostMapping
    public R add(@RequestBody Schedule schedule) {
        return scheduleService.add(schedule);
    }

    @DeleteMapping("/{id}")
    public R remove(@PathVariable Integer id) {
        return scheduleService.remove(id);
    }

    @PutMapping
    public R change(@RequestBody Schedule schedule) {
        return scheduleService.change(schedule);
    }

}
