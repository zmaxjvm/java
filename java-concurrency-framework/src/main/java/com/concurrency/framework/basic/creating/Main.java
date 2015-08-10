package com.concurrency.framework.basic.creating;

/**
 * Created by zmax.
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            CalculatorRunnable calculator = new CalculatorRunnable(i);
            Thread thread = new Thread(calculator);
            thread.start();
        }
    }
}
