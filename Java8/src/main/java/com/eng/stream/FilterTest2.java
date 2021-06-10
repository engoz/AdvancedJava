package com.eng.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by enginoz on 6.12.2017.
 */
public class FilterTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "can", "can", "can");

        //list.stream().forEach(s -> System.out.println(s));

        Predicate<String> lowerThanOrEqualToFour = s -> s.length() <= 4;
        Predicate<String> greaterThanOrEqualToThree = s -> s.length() >= 3;
        Predicate<String> equalsStirng = s -> s.equals("can");

        list.stream()
                .filter(lowerThanOrEqualToFour.and(greaterThanOrEqualToThree))
                .forEach(s -> System.out.println(s));

        Long count = list.stream()
                .filter(equalsStirng)
                .collect(Collectors.counting());

        System.out.println(count);


    }
}
