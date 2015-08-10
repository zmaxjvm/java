package com.concurrency.framework.basic.interrupting;

/**
 * Created by zmax.
 */
public class PrimeGenerator extends Thread {

    @Override
    public void run() {
        long number = 1L;

        while (true) {
            if (isPrime(number)) {
                System.out.println("Number Prime = " + number);
            }

            if (isInterrupted()) {
                System.out.println("The Prime Generator has been Interrupted");
                return;
            }
            number++;
        }
    }


    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }
        for (long i = 2; i < number; i++) {
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }

}




