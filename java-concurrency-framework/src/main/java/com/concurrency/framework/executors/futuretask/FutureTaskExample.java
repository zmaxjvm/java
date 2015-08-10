package com.concurrency.framework.executors.futuretask;

import com.concurrency.framework.utils.SysUtil;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * Created by zmax.
 */
public class FutureTaskExample {

    public static void main(String[] args) {
        MyCallable callable1 = new MyCallable();
        MyCallable callable2 = new MyCallable();

        FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(futureTask1);
        executor.execute(futureTask2);

        printFutureTaskResult(futureTask1, futureTask2, executor);
    }

    /**
     * Print results FutureTask
     *
     * @param futureTask1
     * @param futureTask2
     * @param executor
     */
    private static void printFutureTaskResult(FutureTask<String> futureTask1, FutureTask<String> futureTask2, ExecutorService executor) {

        while (true) {
            if (futureTask1.isDone() && futureTask2.isDone()) {

                try {
                    System.out.println("FutureTask1 output=" + futureTask1.get());
                    System.out.println("FutureTask2 output=" + futureTask2.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

                System.out.println("Done");
                //shut down executor service
                executor.shutdown();
                return;
            }
            SysUtil.sleep(1);
        }

    }

}
