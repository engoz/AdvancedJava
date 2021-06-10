package com.timur.bolum8.stack;

import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("s5");
        stack.push("E");
        stack.push("n");
        stack.push("g");
        stack.push("i");
        stack.push("n");
        stack.push("O");
        stack.push("Z");

        System.out.println("yığıt'taki ogler = " + stack);
        System.out.println("Ambar bos mu  ? = " + stack.empty());
        System.out.println("Ambar boyu   = " + stack.size());
        System.out.println("Yığıtın üstündeki öge   = " + stack.peek());
        System.out.println("Yığıtın üstünden öge al   = " + stack.pop());
        System.out.println("Yığıtın üstündeki öge   = " + stack.peek());
        System.out.println("Yığıtın icinde öge bul  =" + stack.search("E"));

    }
}
