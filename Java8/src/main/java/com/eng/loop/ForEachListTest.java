package com.eng.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by enginoz on 06/04/17.
 */
public class ForEachListTest {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Engin");
        items.add("Özlem");
        items.add("Can");
        items.add("Oz");
        items.add("Nil");

        for (String item : items) {
            System.out.println(item);
        }

        //lamda output
        items.forEach(item -> System.out.println(item));

        items.forEach(item -> {
            if ("C".equals(item))
                System.out.println("Hello Can");
        });

        //Stream and filter
        items.stream().filter(s -> s.contains("O")).forEach(System.out::println);

        //Other Style
        Stream<String> stream = items.stream();
        Predicate<String> predicate = item -> item.length() < 4;
        Stream<String> filtered = stream.filter(predicate);
        filtered.forEach(System.out::println);


    }
}
