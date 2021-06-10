package com.eng.stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by enginoz on 24/04/17.
 */
public class LimitExample {
    public static void main(String[] args) {
        LongStream range = LongStream.range(1, 10000);
        range.limit(10).forEach(System.out::println);
    }
}
