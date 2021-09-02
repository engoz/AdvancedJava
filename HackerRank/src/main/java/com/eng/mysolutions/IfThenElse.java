package com.eng.mysolutions;

/*
Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
* */

import java.util.Scanner;

public class IfThenElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String rtrn = checkWired(N);
        System.out.println(rtrn);
        scanner.close();
    }

    private static String checkWired(int n) {
        if(n % 2 != 0 ){
            return "Weird";
        }
        if (n >= 2 && n <= 5){
            return "Not Weird";
        }
        if (n >= 6 && n <= 20){
            return "Weird";
        }
        if (n > 20 && n< 100){
            return "Not Weird";
        }
        return "Not Weird";
    }


}
