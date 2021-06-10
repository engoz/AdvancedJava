package com.eng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by servicium on 15.04.2016.
 */
public class StreamTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("engin", "ozlem", "can");
        Stream<String> stream = names.stream(); // Ardışık Stream
        Stream<String> paralelStream = names.parallelStream(); //Paralel Stream
        List<String> paralelList = paralelStream.collect(Collectors.toList());
        System.out.println(paralelList);

    }
}
