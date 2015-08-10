package com.concurrency.framework.a.thread.management.creating;

import com.concurrency.framework.basic.creating.CalculatorRunnable;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmax.
 */
public class CalculatorRunnableTest extends TestCase {

    @Test
    public void testRun() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            CalculatorRunnable calculatorRunnable = new CalculatorRunnable(i);
            Thread thread = new Thread(calculatorRunnable);
            thread.start();
        }
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    public void testRunNameAndPriority() throws InterruptedException {
        Thread threads[] = new Thread[10];

        //Set the priority of five of them to the maximum value and set the priority of the rest to the minimum value
        for (int i = 1; i < 5; i++) {
            threads[i] = new Thread(new CalculatorRunnable(i));
            if (i % 2 == 0) {
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
            threads[i].setName("Thread " + i);
        }

        for (int i = 1; i < 5; i++) {
            threads[i].start();
            System.out.printf("Thread name = %s,  %s ", threads[i].getName(), threads[i].getState());
        }

        TimeUnit.SECONDS.sleep(2);
    }

}
