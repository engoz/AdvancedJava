package com.eng.executer;

import java.util.ArrayList;

/**
 * Created by enginoz on 12/15/15.
 */
public class DefaultParalelCounting {

    public static void main(String[] args) {
        Runnable[] counters = {new Counter(1,10),new Counter(11,20), new Counter(21,30),new Counter(31,40),new Counter(41,50)};
        ArrayList<Thread> threads = new ArrayList<Thread>();
        System.out.println("Start");
        for (Runnable counter:counters){
            Thread thread = new Thread(counter);
            threads.add(thread);
            thread.start();

        }

        for (Thread thread : threads){
            while (thread.isAlive());
        }
        System.out.println("Finis");
    }
}
