package com.concurrency.framework.executors.submit;

import java.util.concurrent.*;

/**
 * Created by zmax.
 */
public class SubmitCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future future = executorService.submit(new Callable() {
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });

        System.out.println("future.get() = " + future.get());

    }


}
