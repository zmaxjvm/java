package com.concurrency.framework.executors.scheduledfuture;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by zmax.
 */
public class Task implements Callable<String> {

    private String name;

    public Task(String name) {
        this.name = name;
    }

    public String call() throws Exception {
        System.out.println("Spaceship has launched " + new Date());
        return "PeriodicallyTask scheduled future future" + new Date();
    }

}
