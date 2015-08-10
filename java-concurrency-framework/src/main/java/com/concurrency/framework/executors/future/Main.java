package com.concurrency.framework.executors.future;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by zmax.
 */
public class Main {

    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    private static List<Future<Integer>> resultFutureList = new ArrayList<Future<Integer>>();


    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Integer number = random.nextInt(10);
            FactorialCalcTask calculator = new FactorialCalcTask(number);
            Future<Integer> resultFuture = executor.submit(calculator);
            resultFutureList.add(resultFuture);
        }

//wait for end tasks
        while (executor.getCompletedTaskCount() < resultFutureList.size()) {
            printThreadStatus();
        }
        printThreadStatus();
        printResult();
    }

    /**
     * Show result
     */
    private static void printResult() {
        System.out.printf("\n\n*******Main2: Results*******\n");
        for (int i = 0; i < resultFutureList.size(); i++) {
            Future<Integer> resultFuture = resultFutureList.get(i);
            Integer number = null;
            try {
                number = resultFuture.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

            System.out.printf("Main2: PeriodicallyTask %d: %d\n", i, number);
        }
    }

    /**
     * Print number and status of task
     */
    private static void printThreadStatus() {
        System.out.printf("Main2: Number of Completed Tasks: %d\n", executor.getCompletedTaskCount());

        for (int i = 0; i < resultFutureList.size(); i++) {
            Future<Integer> futureResult = resultFutureList.get(i);
            System.out.printf("Main2: PeriodicallyTask %d: %s\n", i, futureResult.isDone());
        }

        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
