package com.eng.solution;

import java.util.Scanner;

public class SumArrayEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] arrItems = sc.nextLine().split(" ");
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i =0; i< 5; i++){
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        minMaxSum(arr);


    }

    private static void minMaxSum(int[] arr) {
        long min=0, max=0,sum=0;
        min = arr[0] ;
        max = min;
        sum = min;
        for (int i=1; i<arr.length; i++){
            sum+=arr[i];
            if (arr[i] < min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println((sum-max) +"  "+ (sum - min));
    }
}
