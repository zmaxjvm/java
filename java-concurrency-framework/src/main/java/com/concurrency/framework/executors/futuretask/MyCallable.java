package com.concurrency.framework.executors.futuretask;

import com.concurrency.framework.utils.SysUtil;

import java.util.concurrent.Callable;

/**
 * Created by zmax.
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() {
        SysUtil.sleepRandom(2, 5);
        return Thread.currentThread().getName();
    }

}
