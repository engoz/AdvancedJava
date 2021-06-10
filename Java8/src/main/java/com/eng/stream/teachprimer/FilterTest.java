package com.eng.stream.teachprimer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by enginoz on 24/04/17.
 */
public class FilterTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Engin", "Ozlem", "Can", "Zeki", "Remziye", "Nilgun", "Nihal");
        Stream<String> stream = names.stream().map(new Function<String, String>() {
                                                       @Override
                                                       public String apply(String name) {
                                                           return null;
                                                       }
                                                   }
        );
        stream.forEach(name -> {
            System.out.println(name);
        });

        names.stream().filter(FilterTest::isNotEngin)
                .forEach(System.out::println);
    }

    private static boolean isNotEngin(String name) {
        return !name.equals("Engin");
    }


}
