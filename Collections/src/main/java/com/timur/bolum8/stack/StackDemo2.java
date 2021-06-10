package com.timur.bolum8.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by servicium on 28.12.2015.
 */
public class StackDemo2 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        while (true) {
            System.out.println("****************************");
            System.out.println("Lütfen seçiniz:");
            System.out.println("1 -- Yığıta bir tamsayı ekle");
            System.out.println("2 -- Yığıtın üstündeki öğeyi sil");
            System.out.println("3 -- Yığıtı yazdır");
            System.out.println("4 -- Çık");

            Scanner in = new Scanner(System.in);
            Integer input = in.nextInt();

            System.out.println("Seçiminiz: " + input);

            System.out.println("****************************");

            if (input == 1) {
                System.out.println("Tamsayi Giriniz ...... ");
                Scanner pushIn = new Scanner(System.in);
                Integer toPush = pushIn.nextInt();
                integerStack.push(toPush);
                System.out.println("Girilen : " + toPush + " push ile girildi");
            } else if (input == 2) {
                System.out.println("Oge " + integerStack.pop() + "\t Yıgıtın ustunden alidin ");
            } else if (input == 3) {
                System.out.println("Yaz");
                System.out.println("Uzunluk := " + integerStack.size());
                for (int i = integerStack.size(); i > 0; i--) {
                    System.out.println("*****\t" + integerStack.elementAt(i - 1) + "******");
                }
            } else if (input == 4) {
                System.out.println("hoscakal");
                System.exit(0);
            } else {
                System.out.println("Gecersiz Secim");
            }
        }
    }
}
