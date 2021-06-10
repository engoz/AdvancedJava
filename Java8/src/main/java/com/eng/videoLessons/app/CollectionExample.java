package com.eng.videoLessons.app;

import java.util.*;

/**
 * Created by enginoz on 2.01.2018.
 */
public class CollectionExample {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("AAA");
        strings.add("bbb");
        strings.add("CCC");
        strings.add("ddd");
        strings.add("EEE");

        Collections.sort(strings);
        System.out.println("Simple Sort");
        /*
        for (String str: strings){
            System.out.println(str);
        }
        */
        strings.forEach(str -> System.out.println(str));

        Comparator<String> comparator = (s1, s2) -> {
            return s1.compareToIgnoreCase(s2);
        };
        Collections.sort(strings, comparator);
        System.out.println("Sort With Comparator");

        /*
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        */
        strings.forEach(str -> System.out.println(str));
    }

}
