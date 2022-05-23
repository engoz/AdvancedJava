package com.eng.counter;

public class CounterSyncronizedEx2 {

    public static void main(String[] args) {
        Counter2 counterSyncronized = new Counter2();

        Thread t1 = new Thread(getRunable(counterSyncronized,"Thread -1 final count"));
        Thread t2 = new Thread(getRunable(counterSyncronized,"Thread -2 final count"));

        t1.start();
        t2.start();

    }

    private static  Runnable getRunable(Counter2 counterSyncronized, String message) {
        return ()->{
            synchronized(counterSyncronized) {
                for (int i = 0; i < 1_000_000; i++) {
                    counterSyncronized.incrAndGet();
                }
                System.out.println(message + " " + counterSyncronized.get());
            }
        };
    }
}
