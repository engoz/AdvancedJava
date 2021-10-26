package advance.sorting;

import java.util.Date;
import java.util.Random;

public class BubbleSort {
    private static int max = 1000;
    static  int[] arr = new int[1000];

    public static void main(String[] args) {
        for(int i=0; i<max; i++){
            arr[i] = new Random().nextInt(1000000);
        }
        System.out.println("UnSorted Array");
        print(arr);
        long start = System.currentTimeMillis();
        bubbleSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("Sorted Array = " + (end - start) );
        print(arr);

    }

    private static void  bubbleSort(int[] arr) {
        int n = arr.length;
        int temp=0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++ ){
                //swap;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private static void print(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
