package com.eng.stream;

import java.util.stream.IntStream;

/**
 * Created by enginoz on 24/04/17.
 */
public class CountExample {
    public static void main(String[] args) {
        IntStream range = IntStream.range(1, 10);
        IntStream rangeClosed = IntStream.rangeClosed(1, 10);
        System.out.println(range.count());
        System.out.println(rangeClosed.count());
    }
}
