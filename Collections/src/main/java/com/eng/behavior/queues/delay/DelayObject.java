package com.eng.behavior.queues.delay;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

// The DelayObject for DelayQueue
// It must implement Delayed and
// its getDelay() and compareTo() method
public class DelayObject implements Delayed {

    private String name;
    private long expireTime;

    // Constructor of DelayObject
    public DelayObject(String name, long delayTime)
    {
        //ExpireTime =  curruntTime+delay

        this.name = name;
        this.expireTime = System.currentTimeMillis()
                + delayTime;
    }

    // Implementing getDelay() method of Delayed
    @Override
    public long getDelay(TimeUnit unit)
    {
        long diff = expireTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    // Implementing compareTo() method of Delayed
    @Override
    public int compareTo(Delayed obj)
    {
        if (this.expireTime < ((DelayObject)obj).expireTime) {
            return -1;
        }
        if (this.expireTime > ((DelayObject)obj).expireTime) {
            return 1;
        }
        return 0;
    }

    // Implementing toString()
    // method of Delayed
    @Override
    public String toString()
    {
        return "\n{"
                + "name=" + name
                + ", time=" + expireTime
                + "}";
    }
}

