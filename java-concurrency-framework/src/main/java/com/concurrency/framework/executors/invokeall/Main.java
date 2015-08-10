package com.concurrency.framework.executors.invokeall;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

/**
 * Created by zmax.
 */
public class Main {

    private static ExecutorService executorService = Executors.newSingleThreadExecutor();

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Future<String>> futures = executorService.invokeAll(prepareShips());

        for (Future<String> future : futures) {
            System.out.println("future.get = " + future.get());
        }
        executorService.shutdown();
    }


    /**
     * Prepare initial data
     *
     * @return
     */
    private static Set<Callable<String>> prepareShips() {
        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            callables.add(new Callable<String>() {
                public String call() throws Exception {
 //                   SysUtil.sleepRandom(2, 5);
                    return "Ship " + finalI;
                }
            });
        }
        return callables;
    }

}
