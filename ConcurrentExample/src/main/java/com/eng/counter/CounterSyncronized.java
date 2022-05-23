package com.eng.counter;

public class CounterSyncronized {

    private long count = 0;

    public long incrAndGet(){
        synchronized (this){
            this.count ++;
            return this.count;
        }
    }

    public long get(){
        synchronized (this){
            return this.count;
        }
    }

}
