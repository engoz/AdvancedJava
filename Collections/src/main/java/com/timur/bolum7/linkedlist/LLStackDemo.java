package com.timur.bolum7.linkedlist;

import java.util.LinkedList;

/**
 * Created by servicium on 28.12.2015.
 */
public class LLStackDemo {

    private LinkedList list = new LinkedList();

    public void push(Object v) {
        list.addFirst(v);
    }

    public Object top() {
        return list.getFirst();
    }

    public Object pop() {
        return list.removeFirst();
    }

    public static void main(String[] args) {
        LLStackDemo stack = new LLStackDemo();
        for (int i = 0; i < 10; i++)
            stack.push(new Integer(i));

        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }
}
