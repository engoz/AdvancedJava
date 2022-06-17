package com.eng.oo;

public class OverLoadEx {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public static void main(String args[]) {
        OverLoadEx test = new OverLoadEx();
        test.print(10);
    }
}
