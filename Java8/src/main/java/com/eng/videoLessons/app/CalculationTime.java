package com.eng.videoLessons.app;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by enginoz on 3.01.2018.
 */
public class CalculationTime {

    public static void main(String[] args) {
        Instant start = Instant.now();

        System.out.println("Start " + start);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant stop = Instant.now();

        System.out.println("Stop " + stop);

        Duration elapsed = Duration.between(start, stop);
        System.out.println("Elapsed " + elapsed.toMillis());
    }
}
