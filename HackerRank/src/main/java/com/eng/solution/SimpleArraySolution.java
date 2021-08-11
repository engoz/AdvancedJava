package com.eng.solution;

import java.util.Scanner;

public class SimpleArraySolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        int result = simpleArraySum(n,arr);
        System.out.println(result);
    }

    private static int simpleArraySum(int n, int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i=0; i<len; i++){
            sum += arr[i]; //sum = sum + arr[i];
        }
        return sum;
    }
}
