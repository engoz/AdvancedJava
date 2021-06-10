package com.eng.stream;

import java.util.stream.IntStream;

/**
 * Created by enginoz on 24/04/17.
 */
public class DistinctExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 1, 2, 3, 5, 8, 13, 13, 8);
        intStream.distinct().forEach(System.out::println);
    }
}
