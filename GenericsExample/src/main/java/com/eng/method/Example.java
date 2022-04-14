package com.eng.method;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5};
        List<String> stringList = Example.fromArrayToList(integers, Objects::toString);
        System.out.println(stringList);
    }

    public static <T> List<T> fromArrayToList(T[] a){
        return Arrays.stream(a).collect(Collectors.toList());
    }

    public static <T,G> List<G> fromArrayToList(T[] a, Function<T,G> mapperFunction){
        return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
    }
}
