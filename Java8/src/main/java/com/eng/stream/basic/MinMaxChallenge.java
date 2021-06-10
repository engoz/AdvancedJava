package com.eng.stream.basic;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxChallenge {

    public static void main(String[] args) {
        IntStream intStream = Stream.of(1, 2, 3, 4, 5, 6).mapToInt(n -> n);
        IntStream intStream2 = intStream;
        OptionalInt optMin = intStream.parallel().min();
        OptionalInt optMax = intStream2.parallel().max();

        int sum = optMax.orElse(5) + optMin.orElse(5);
        System.out.println(sum);
    }
}
