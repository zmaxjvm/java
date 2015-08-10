package com.concurrency.framework.executors.periodically;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Main: Station  for the launch spaceships");

        PeriodicallyTask periodicallyTask = new PeriodicallyTask("PeriodicallyTask");

        executor.scheduleAtFixedRate(periodicallyTask, 0, 5, TimeUnit.SECONDS);

        TimeUnit.SECONDS.sleep(15);
        executor.shutdown();
    }


}
