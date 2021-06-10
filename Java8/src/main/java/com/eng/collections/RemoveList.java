package com.eng.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveList {

    // Generic function to remove elements using Predicate
    public static <T> List<T>
    removeElements(List<T> l, Predicate<T> p) {

        // Removing nulls using Java Stream
        // using Predicate condition in removeIf()
        l.removeIf(x -> p.test(x));

        // Return the list
        return l;
    }

    public static void main(String[] args) {

        // Create a list with null values
        List<String> l = new ArrayList<>(
                Arrays.asList("Geeks",
                        null,
                        "forGeeks",
                        null,
                        "A computer portal"));

        // Print the list
        System.out.println("List with null values: " + l);

        // Creating a Predicate condition checking for null
        Predicate<String> isNull = i -> (i == null);

        // Removing using Predicate
        l = removeElements(l, isNull);

        // Print the list
        System.out.println("List with null values removed: " + l);
    }
}
