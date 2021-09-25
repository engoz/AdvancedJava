package com.eng.concurrents;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by servicium on 31.05.2016.
 */
public class DelayedElement implements Delayed {
    @Override
    public long getDelay(TimeUnit unit) {
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
        return 0;
    }
}
