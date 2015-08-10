package com.concurrency.framework.executors.cachedthreadpool;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Task implements Runnable {

    private Date initDate;
    private String name;

    public Task(String name) {
        initDate = new Date();
        this.name = name;
    }

    @Override
    public void run() {

        System.out.printf("%s: PeriodicallyTask %s: Created on: %s\n", Thread.currentThread().getName(), name, initDate);
        System.out.printf("%s: PeriodicallyTask %s: Started on: %s\n", Thread.currentThread().getName(), name, new Date());

        try {
            int duration = 20000;
            System.out.printf("%s: PeriodicallyTask %s: Doing a task during %d seconds\n", Thread.currentThread().getName(), name, duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s: PeriodicallyTask %s: Finished on: %s\n", Thread.currentThread().getName(), name, new Date());
    }

}
