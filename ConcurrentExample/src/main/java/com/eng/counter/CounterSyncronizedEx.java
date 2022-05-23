package com.eng.counter;

public class CounterSyncronizedEx {
    public static void main(String[] args) {
        CounterSyncronized counterSyncronized = new CounterSyncronized();

        Thread t1 = new Thread(getRunable(counterSyncronized,"Thread -1 final count"));
        Thread t2 = new Thread(getRunable(counterSyncronized,"Thread -1 final count"));

        t1.start();
        t2.start();

    }

    private static Runnable getRunable(CounterSyncronized counterSyncronized, String message) {
        return ()->{
            for (int i=0; i< 1_000_000; i++){
                counterSyncronized.incrAndGet();
            }
            System.out.println(message + " " + counterSyncronized.get());
        };
    }
}
