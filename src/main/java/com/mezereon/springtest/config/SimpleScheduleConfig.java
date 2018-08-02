package com.mezereon.springtest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @program: SimpleScheduleConfig
 * @description: Set the schedule class
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/8/2
 **/

@Configuration //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling // 2.开启定时任务
public class SimpleScheduleConfig {
    //3.添加定时任务
//    @Scheduled(cron = "0/5 * * * * ?")
//    private void configureTasks() {
//       System.err.println("执行定时任务1: " + LocalDateTime.now());
//    }
}
