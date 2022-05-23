package com.eng.counter;

public class Counter2 {

    private long count = 0;

    public long incrAndGet(){
            this.count ++;
            return this.count;
    }

    public long get(){
            return this.count;
    }
}
