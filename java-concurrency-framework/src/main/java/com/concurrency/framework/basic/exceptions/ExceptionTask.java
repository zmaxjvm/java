package com.concurrency.framework.basic.exceptions;

import java.util.concurrent.TimeUnit;
/**
 * Created by zmax.
 */
public class ExceptionTask implements Runnable {

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int d = 10 / 0;
        //int numero = Integer.parseInt("TTT");
    }
}
