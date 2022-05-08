package com.eng.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamOfDemo {

    public static void main(String[] args) {
        System.out.println("--- IntStream ---");
        IntStream intStream = IntStream.of(12, 14, 16);
        intStream.forEach(e -> System.out.println(e));

        System.out.println("--- LongStream ---");
        LongStream longStream = LongStream.of(154L, 236L, 306L);
        longStream.forEach(e -> System.out.println(e));

        System.out.println("--- DoubleStream ---");
        DoubleStream doubleStream = DoubleStream.of(123.56, 456.87, 784.65);
        doubleStream.forEach(e -> System.out.println(e));
    }

}
