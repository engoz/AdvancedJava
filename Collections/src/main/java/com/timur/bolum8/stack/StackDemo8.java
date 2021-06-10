package com.timur.bolum8.stack;

import java.util.LinkedList;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo8 {

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
        StackDemo8 stack = new StackDemo8();
        for (int i = 0; i < 10; i++)
            stack.push(new Integer(i));
        for (int i = 0; i < 10; i++)
            System.out.print("  " + stack.pop());
    }

}
