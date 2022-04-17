package com.eng.boxing;

public class AutoBoxingAndUnboxingEx {
    public static void main(String[] args)
    {

        // Creating an Integer Object
        // with custom value say it be 10
        Integer i = new Integer(10);

        // Unboxing the Object
        int i1 = i;

        // Print statements
        System.out.println("Value of i:" + i);
        System.out.println("Value of i1: " + i1);

        // Autoboxing of character
        Character gfg = 'a';

        // Auto-unboxing of Character
        char ch = gfg;

        // Print statements
        System.out.println("Value of ch: " + ch);
        System.out.println(" Value of gfg: " + gfg);
    }

}
