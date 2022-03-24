package com.eng.behavior.hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiMapEx {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        put(map, "first", "hello");
        put(map, "first", "foo");
        put(map, "bar", "foo");
        put(map, "first", "hello");

        map.forEach((s, strings) -> {
            System.out.print(s + ": ");
            System.out.println(strings.stream().collect(Collectors.joining(", ")));
        });
    }

    private static <K, V> void put(Map<K, List<V>> map, K key, V value) {
        map.compute(key, (s, strings) -> strings == null ? new ArrayList<>() : strings).add(value);
    }
}
