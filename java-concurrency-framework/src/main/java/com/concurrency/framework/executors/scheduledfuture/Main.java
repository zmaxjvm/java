package com.concurrency.framework.executors.scheduledfuture;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Main {

    public static final int DELAY = 5;

    public static final int COUNT_THREADS = 20;

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);
        List<ScheduledFuture<String>> scheduledFutureList = new ArrayList<ScheduledFuture<String>>();

        System.out.printf("Main: Starting : %s\n", new Date());

        for (int i = 0; i < COUNT_THREADS; i++) {
            Task task = new Task("PeriodicallyTask " + i);
            scheduledFutureList.add(executor.schedule(task, DELAY, TimeUnit.SECONDS));
        }
        executor.shutdown();

    }

}
