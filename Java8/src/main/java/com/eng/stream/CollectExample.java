package com.eng.stream;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by enginoz on 24/04/17.
 */
public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Engin", "Ozlem", "Can", "Zeki", "Remziye", "Nilgun", "Nihal");
        List<String> list = names.stream().collect(Collectors.toList());
        Set<String> set = names.stream().collect(Collectors.toSet());
        Long count = names.stream().collect(Collectors.counting());
        String collect = names.stream().collect(Collectors.joining("-"));
        Map<Integer, List<String>> integerListMap = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(count);

    }
}
