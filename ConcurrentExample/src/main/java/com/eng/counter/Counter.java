package com.eng.counter;

/**
 * Created by enginoz on 24/01/17.
 */
public class Counter {

    long count = 0;

    public synchronized void add(long value){
        this.count += value;
    }

    public long getCount(){
        return count;
    }
}
