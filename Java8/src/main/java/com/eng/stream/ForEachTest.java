package com.eng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by enginoz on 24/04/17.
 */
public class ForEachTest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Engin", "Ozlem", "Can", "Zeki", "Remziye", "Nilgun", "Nihal");
        Stream<String> stream = names.stream();
        Predicate<String> predicate = name -> name.length() < 4;
        Stream<String> filtered = stream.filter(predicate);
        filtered.forEach(System.out::println);

        //Tek satır
        names.stream().filter(name -> name.length() < 4).forEach(System.out::println);

    }
}
