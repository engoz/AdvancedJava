package com.eng.stream;

import java.util.Arrays;
import java.util.List;

public class ParalelStreamEx {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        listOfNumbers.stream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

        List<Integer> listOfNumbers2 = Arrays.asList(1, 2, 3, 4);
        listOfNumbers2.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );
    }
}
