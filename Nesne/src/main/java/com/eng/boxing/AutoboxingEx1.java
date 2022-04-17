package com.eng.boxing;

import java.util.ArrayList;
import java.util.List;
// Java Program to Illustrate Autoboxing
public class AutoboxingEx1 {
    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of integer type
        List<Integer> list = new ArrayList<Integer>();

        // Adding the int primitives type values by
        //  converting them into Integer wrapper object
        for (int i = 0; i < 10; i++)

            System.out.println(
                    list.add(Integer.valueOf(i)));
    }
}
