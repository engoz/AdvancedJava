package com.eng.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class BoxedExaple {

    public static void main(String[] args) {
        //It works perfect !!
        List<String> strings = Stream.of("how", "to", "do", "in", "java")
                .collect(Collectors.toList());

        /* Compilation Error !!
        To convert a stream of primitives, you must first box the elements in their wrapper class and then collect them. This type of stream in called boxed stream.
        IntStream.of(1,2,3,4,5)
                .collect(Collectors.toList());

         */

        //Get the collection and later convert to stream to process elements
        List<Integer> ints = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(ints);

//Stream operations directly
        Optional<Integer> max = IntStream.of(1, 2, 3, 4, 5)
                .boxed()
                .max(Integer::compareTo);

        System.out.println(max);

        List<Long> longs = LongStream.of(1l, 2l, 3l, 4l, 5l)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(longs);

        List<Double> doubles = DoubleStream.of(1d, 2d, 3d, 4d, 5d)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(doubles);

    }
}
