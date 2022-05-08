package com.eng.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounterWithoutLock {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int getValue() {
        return counter.get();
    }
    public void increment() {
        while(true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;
            if(counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        SafeCounterWithoutLock lock = new SafeCounterWithoutLock();
        lock.increment();;
        System.out.println(lock.getValue());
    }
}
