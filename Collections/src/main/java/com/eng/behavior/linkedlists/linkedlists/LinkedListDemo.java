package com.eng.behavior.linkedlists.linkedlists;

/**
 * Created by enginoz on 14.12.2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedListU<String> ls = new LinkedListU<>();
        ls.add("Engin");
        ls.add("Can");
        ls.add("Ozlem");
        ls.add("Nihal");
        ls.add("Nilgun");
        ls.display();
        ls.delete();
        ls.display();
    }
}
