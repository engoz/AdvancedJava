package com.eng.futurecall;

import java.util.concurrent.Callable;

/**
 * Created by enginoz on 10/15/16.
 */
public class FactorialTask implements Callable<Long> {
    //http://www.obenplus.com
    //Future Task Kullanim Ornegi

    int factorialNumber = 0;

    public FactorialTask(int number) {
        this.factorialNumber = number;
    }

    @Override
    public Long call() throws Exception {
        return factorial();
    }

    private long factorial() throws InterruptedException {
        if (factorialNumber < 0) {
            throw new IllegalArgumentException("Factorial number must be bigger than or equal to zero!");
        }

        long result = 1;
        while (factorialNumber > 0) {
            result = result * factorialNumber;
            factorialNumber--;
            Thread.sleep(1000);
        }

        return result;
    }

}
