package com.timur.bolum7.linkedlist;

import java.util.LinkedList;

/**
 * Created by servicium on 28.12.2015.
 */
public class LLStackDemo2 {

    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        for (int i = 0; i < 10; i++)
            stack.addFirst(new Integer(i));

        System.out.println(stack.getFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.getFirst());
    }
}
