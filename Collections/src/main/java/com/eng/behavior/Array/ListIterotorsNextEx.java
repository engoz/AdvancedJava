package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterotorsNextEx {

    public static void main(String[] args) {
        try {

            // Creating object of ArrayList<Integer>
            ArrayList<String>
                    arrlist = new ArrayList<String>();

            // adding element to arrlist
            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("D");

            // print arrlist
            System.out.println("ArrayList: "
                    + arrlist);

            // Creating object of ListIterator<String>
            // using listIterator() method
            ListIterator<String>
                    iterator = arrlist.listIterator();

            // Printing the iterated value
            System.out.println("\nUsing ListIterator:\n");
            while (iterator.hasNext()) {
                String next = iterator.next();

                System.out.println("Next Value is : "
                        + next);
            }
        } catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }

}
