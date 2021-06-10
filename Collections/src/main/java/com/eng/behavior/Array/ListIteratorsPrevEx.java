package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorsPrevEx {
    public static void main(String[] args) {
        ArrayList<String> appliances = new ArrayList<String>();
        appliances.add("Fan");
        appliances.add("Tubelight");
        appliances.add("Bulb");
        appliances.add("Television");
        ListIterator<String> listIterator = appliances.listIterator();
        System.out.println("The list of electrical appliances is given as : " + appliances);
        System.out.println("In the forward direction : ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("In the backward direction:- ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
