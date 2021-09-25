package com.eng.counter;

/**
 * Created by enginoz on 24/01/17.
 */
public class Example1 {
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread  threadA = new CounterThread(counter);
        Thread  threadB = new CounterThread(counter);

        threadA.start();
        threadB.start();

        System.out.println(counter.getCount());
    }
}
