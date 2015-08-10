package com.concurrency.framework.executors.submit;

import java.util.concurrent.*;

/**
 * Created by zmax.
 */
public class SubmitRunnable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future future = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        System.out.print("Result = " + future.get());  //returns null if the task has finished correctly.
    }

}
