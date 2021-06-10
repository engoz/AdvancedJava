package com.eng.stream.teachprimer;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FlatMapExample2 {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"a,d"}};

        Stream<String[]> temp = Arrays.stream(data).filter(strings -> strings.equals("a"));

        temp.forEach(System.out::println);


        Stream<String[]> temp2 = Arrays.stream(data);

        Stream<String> stringStream = temp2.flatMap(Arrays::stream);

        Stream<String> stream = stringStream.filter("a"::equals);

        stream.forEach(System.out::println);

    }
}
