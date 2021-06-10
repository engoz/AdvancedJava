package com.eng.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class StreamOFEx {
    public static void main(String[] args) {

        StringBuilder detail = new StringBuilder();


        String[] array = {"G", "e", "e", "k", "s"};

        // Create an AtomicInteger for index
        AtomicInteger index = new AtomicInteger();

        // Iterate over the Stream with indices
        Arrays

                // Get the Stream from the array
                .stream(array)

                // Map each elements of the stream
                // with an index associated with it
                .map(str -> index.getAndIncrement() + " " + str + "\n")

                // Print the elements with indices
                .forEach(detail::append);

        System.out.println(detail);

    }


}
