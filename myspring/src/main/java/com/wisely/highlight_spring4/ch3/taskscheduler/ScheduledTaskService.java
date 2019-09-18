package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
//@EnableScheduling
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormate = new
            SimpleDateFormat("HH:MM:SS");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5s执行一次 " + dateFormate.format(new Date()));
    }

    @Scheduled(cron = "0 28 11 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+ dateFormate.format(new Date()) + "执行");
    }

}
