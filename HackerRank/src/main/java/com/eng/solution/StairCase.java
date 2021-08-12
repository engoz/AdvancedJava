package com.eng.solution;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        stairCase2(n);
        in.close();
    }


    private static void stairCase2(int n) {
        String s = "#";
        for(int i=1; i<=n; i++){
            System.out.printf("%"+n+"s\n",s);
            s +="#";
        }
    }
    private static void stairCase(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
