package com.concurrency.framework.executors.execute;

import com.concurrency.framework.utils.SysUtil;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Airfield implements Runnable {

    private Date initDate;
    private String name;

    public Airfield(String name) {
        initDate = new Date();
        this.name = name;
    }

    @Override
    public void run() {
            SysUtil.sleepRandom(2,5);
            System.out.printf("%s: %s: launching %d seconds\n", Thread.currentThread().getName(), name);

    }

}
