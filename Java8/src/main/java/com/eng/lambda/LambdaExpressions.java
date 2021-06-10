package com.eng.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressions {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Comparator<Integer> myComporator  = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        System.out.println(numbers);
        //Collections.sort(numbers,myComporator);
        Collections.sort(numbers, (x,y)->y-x);
        System.out.println(numbers);

    }
}
