package com.eng.stream.mkyong;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by enginoz on 14/10/17.
 */
public class FilterCollect {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Spring", "Java", "mkyong");
        List<String> result = lines.stream().filter(line -> !"mkyong".equals(line)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
