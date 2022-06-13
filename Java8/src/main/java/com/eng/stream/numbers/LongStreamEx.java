package com.eng.stream.numbers;

import java.util.stream.LongStream;

public class LongStreamEx {
    public static void main(String[] args) {

            // Creating an LongStream
            LongStream stream = LongStream.rangeClosed(-4L, 3L);

            // Displaying the elements in range
            // including the lower and upper bound
            stream.forEach(System.out::println);

        // Creating an LongStream
        LongStream stream2 = LongStream.range(6L, 10L);

        // Displaying the elements in range
        // including the lower bound but
        // excluding the upper bound
        stream2.forEach(System.out::println);

        // Creating an LongStream having single element only
        LongStream stream3 = LongStream.of(-7L);

        // Displaying the LongStream having single element
        stream3.forEach(System.out::println);
    }

}
