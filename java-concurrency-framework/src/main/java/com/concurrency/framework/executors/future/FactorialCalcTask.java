package com.concurrency.framework.executors.future;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;


/**
 * Created by zmax.
 */
public class FactorialCalcTask implements Callable<Integer> {

    public FactorialCalcTask(Integer number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int result = 1;
        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }
        System.out.printf("%s: %d\n", Thread.currentThread().getName(), result);
        return result;
    }

    private Integer number;

}
