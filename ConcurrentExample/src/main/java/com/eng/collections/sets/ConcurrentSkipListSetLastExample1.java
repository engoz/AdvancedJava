package com.eng.collections.sets;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetLastExample1 {
    public static void main(String[] args)
    {

        // Initializing the set using
        // ConcurrentSkipListSet()
        ConcurrentSkipListSet<Integer> set
                = new ConcurrentSkipListSet<Integer>();

        // Adding elements to this set
        set.add(78);
        set.add(64);
        set.add(12);
        set.add(45);
        set.add(8);

        // Printing the ConcurrentSkipListSet
        System.out.println("ConcurrentSkipListSet: " + set);


        // Printing the highest element of the set
        // using last() method
        System.out.println("The highest element of the set: "
                + set.last());

        // Retrieving and removing first element of the set
        System.out.println("The first element of the set: "
                + set.pollFirst());

        // Checks if 9 is present in the set
        // using contains() method
        if (set.contains(9))
            System.out.println("9 is present in the set.");
        else
            System.out.println("9 is not present in the set.");

        // Printing the size of the set
        // using size() method
        System.out.println("Number of elements in the set = "
                + set.size());

        // Initializing the set using
        // ConcurrentSkipListSet(Collection)
        ConcurrentSkipListSet<Integer> set1
                = new ConcurrentSkipListSet<Integer>(set);

        // Printing the ConcurrentSkipListSet1
        System.out.println("ConcurrentSkipListSet1: "
                + set1);



        // Initializing the set using
        // ConcurrentSkipListSet()
        ConcurrentSkipListSet<String> set2
                = new ConcurrentSkipListSet<>();

        // Adding elements to this set
        set2.add("Apple");
        set2.add("Lemon");
        set2.add("Banana");
        set2.add("Apple");



        // creating an iterator
        Iterator<String> itr = set2.iterator();

        System.out.print("Fruits Set: ");
        while (itr.hasNext()) {
                System.out.print(itr.next() + " ");
        }
    }
}
