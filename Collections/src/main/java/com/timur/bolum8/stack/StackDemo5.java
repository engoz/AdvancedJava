package com.timur.bolum8.stack;

import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo5 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Londra");
        stack.push("Moskova");
        stack.push("Ankara");
        stack.push("Paris");
        stack.push("Viyana");

        System.out.println(stack);
        System.out.println(stack.search("Ankara"));
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
    }


}
