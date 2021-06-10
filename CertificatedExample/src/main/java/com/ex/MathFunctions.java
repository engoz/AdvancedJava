package com.ex;

public class MathFunctions {

    public static void addToInt(int x, int amaountToAdd){
        x =  x + amaountToAdd;
    }

    public static void main(String[] args) {
        var a = 15;
        var b = 10;
        MathFunctions.addToInt(a,b);
        System.out.println(a);
    }
}
