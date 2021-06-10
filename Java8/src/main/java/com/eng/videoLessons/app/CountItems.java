package com.eng.videoLessons.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enginoz on 3.01.2018.
 */
public class CountItems {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            items.add("İtem " + i);
        }

        long c1 = items.stream().count();
        System.out.println("Squential " + c1);
        long c2 = items.parallelStream().count();
        System.out.println("Parallel " + c2);
    }
}
