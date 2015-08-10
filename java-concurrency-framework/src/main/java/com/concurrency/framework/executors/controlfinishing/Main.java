package com.concurrency.framework.executors.controlfinishing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class Main {

    private static final int COUNT = 3;
    private static final int WAITING_DELAY = 4;

    public static void main(String[] args) {
        ExecutorService executor = (ExecutorService) Executors.newCachedThreadPool();
        ResultTask resultTasks[] = new ResultTask[COUNT];

//start task execution
        for (int i = 0; i < COUNT; i++) {
            ExecutableTask executableTask = new ExecutableTask("Aircraft " + i);
            resultTasks[i] = new ResultTask(executableTask);
            executor.submit(resultTasks[i]);
        }

//wait for a little bit
        try {
            TimeUnit.SECONDS.sleep(WAITING_DELAY);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

//canceled tasks which have not done
        for (int i = 0; i < resultTasks.length; i++) {
            resultTasks[i].cancel(true);
        }

//show result about tasks
        for (int i = 0; i < resultTasks.length; i++) {
            try {
                if (!resultTasks[i].isCancelled()) {
                    System.out.printf("%s\n", resultTasks[i].get());
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}
