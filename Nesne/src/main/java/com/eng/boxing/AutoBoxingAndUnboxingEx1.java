package com.eng.boxing;

import java.util.ArrayList;
import java.util.List;

// using Autobxing and Unboxing
public class AutoBoxingAndUnboxingEx1 {
    // Method 1
    // To sum odd numbers
    public static int sumOfOddNumber(List<Integer> list)
    {

        // Initially setting sum to zero
        int sum = 0;

        for (Integer i : list) {

            // Unboxing of i automatically
            if (i % 2 != 0)
                sum += i;

            // Unboxing of i is done automatically
            // using intvalue implicitly
            if (i.intValue() % 2 != 0)
                sum += i.intValue();
        }

        // Returning the odd sum
        return sum;
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of integer type
        List<Integer> list = new ArrayList<Integer>();

        // Adding the int primitives type values to List
        for (int i = 0; i < 10; i++)
            list.add(i);

        // Getting sum of all odd numbers in List
        int sumOdd = sumOfOddNumber(list);

        // Printing sum of odd numbers
        System.out.println("Sum of odd numbers = "
                + sumOdd);
    }
}
