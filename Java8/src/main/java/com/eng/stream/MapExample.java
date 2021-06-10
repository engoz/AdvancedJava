package com.eng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by enginoz on 24/04/17.
 */
public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Engin", "Ozlem", "Can", "Zeki", "Remziye", "Nilgun", "Nihal");
        Stream<String> stream = names.stream();
        Stream<String> upperStream = stream.map(String::toLowerCase);
        List<String> upperNames = upperStream.collect(Collectors.toList());

        IntStream.rangeClosed(1, 5);

    }
}
