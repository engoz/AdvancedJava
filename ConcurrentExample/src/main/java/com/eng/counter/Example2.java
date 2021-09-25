package com.eng.counter;

/**
 * Created by enginoz on 24/01/17.
 */
public class Example2 {

    public static void main(String[] args){
        Counter counterA = new Counter();
        Counter counterB = new Counter();
        Thread  threadA = new CounterThread(counterA);
        Thread  threadB = new CounterThread(counterB);

        threadA.start();
        threadB.start();

        System.out.println(counterA.getCount());
        System.out.println(counterB.getCount());
    }

}
