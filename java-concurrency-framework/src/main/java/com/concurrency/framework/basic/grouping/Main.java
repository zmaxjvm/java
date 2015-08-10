package com.concurrency.framework.basic.grouping;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Searcher");

        Result result = new Result();
        SearchTask searchTask = new SearchTask(result);

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(threadGroup, searchTask);
            thread.start();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
