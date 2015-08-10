package com.concurrency.framework.basic.join;

import java.util.concurrent.TimeUnit;

/**
 * Created by mzavgorodny on 3/3/14.
 */
public class Second implements Runnable {

    @Override
    public void run() {
        vait();
        System.out.println("Second");
        System.out.println("Second finished");
    }

    private void vait(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
