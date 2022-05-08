package com.eng.behavior.Array;

import java.util.*;

/**
 * Created by servicium on 30.05.2016.
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("C");
        collection.add("B");

        collection.forEach(System.out::println);

        System.out.println("LinkedList");
        collection = new LinkedList<>();
        collection.add("A");
        collection.add("C");
        collection.add("B");

        collection.forEach(System.out::println);

        System.out.println("PriorityQueue");
        collection = new PriorityQueue<>();
        collection.add("A");
        collection.add("C");
        collection.add("B");

        collection.forEach(System.out::println);

        System.out.println("TreeSet");
        collection = new TreeSet<>();
        collection.add("A");
        collection.add("C");
        collection.add("B");

        collection.forEach(System.out::println);

        System.out.println("LinkedHashSet");
        collection = new LinkedHashSet<>();
        collection.add("A");
        collection.add("C");
        collection.add("B");

        collection.forEach(System.out::println);

        System.out.println("ArrayDeque");
        collection = new ArrayDeque<>();
        collection.add("A");
        collection.add("C");
        collection.add("B");

        collection.forEach(System.out::println);

        System.out.println("ArrayList");
        collection = new ArrayList<>();
        collection.add("A");
        collection.add("C");
        collection.add("B");

        collection.forEach(System.out::println);

    }
}
