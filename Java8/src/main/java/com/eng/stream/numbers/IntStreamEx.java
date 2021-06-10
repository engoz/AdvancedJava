package com.eng.stream.numbers;

import java.util.stream.IntStream;

public class IntStreamEx {

    public static void main(String[] args) {
        IntStream.range(0, 100).forEach(System.out::println);

        System.out.println(IntStream.range(0, 10).max().getAsInt());
        System.out.println(IntStream.range(0, 10).min().getAsInt());
        System.out.println(IntStream.range(0, 10).sum());
        System.out.println(IntStream.range(0, 10).average().getAsDouble());
    }
}
