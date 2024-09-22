package com.kototo.task.task;

import com.kototo.task.service.OrderInfoService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {
    @Autowired
    private OrderInfoService orderInfoService;

    @Scheduled(cron = "0/5 * * * * ?")
    public void trigger() {
        DateTime dateTime = new DateTime().plusDays(1);
        String timeString = dateTime.toString("yyyy-MM-dd");
        System.out.println("timeString = " + timeString);
        orderInfoService.sendMessage(timeString);
    }
}
