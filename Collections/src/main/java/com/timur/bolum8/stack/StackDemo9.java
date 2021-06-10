package com.timur.bolum8.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo9 {

    static void showpush(Stack stack, int a) {
        stack.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("Stack " + stack);
    }

    static void showpop(Stack stack) {
        System.out.print("pop -----> ");
        Integer a = (Integer) stack.pop();
        System.out.println(a);
        System.out.println("Stack " + stack);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("stack " + stack);
        showpush(stack, 42);
        showpush(stack, 66);
        showpush(stack, 99);
        showpop(stack);
        showpop(stack);
        showpop(stack);

        try {
            showpop(stack);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }

    }

}
