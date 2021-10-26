package advance.sorting;

import java.util.Random;

public class SelectionSort {

    private static int maxNumbers = 1000;
    static  int[] num = new int[1000];

    public static void main(String[] args) {
        for(int i=0; i<maxNumbers; i++){
           num[i] = new Random().nextInt(100000);
        }

        System.out.println("Unsorted Numbers");
        for (int i=0; i<num.length; i++){
            System.out.printf("%d ", num[i] );
        }
        System.out.println();
        long start = System.currentTimeMillis();
        selectionSort(num,0,maxNumbers-1);
        long end = System.currentTimeMillis();
        System.out.println("Sorted Array = " + (end - start) );
        for (int i=0; i<num.length; i++){
            System.out.printf("%d ", num[i] );
        }
    }

    private static void selectionSort(int[] num, int lo, int hi) {
        for (int h=lo; h<hi; h++){
            int s = getSmallest(num,h,hi);
            swap(num,h,s);
        }
    }

    private static int getSmallest(int[] num, int lo,int hi){
        int small = lo;
        for (int h=lo+1; h<=hi; h++)
            if (num[h] < num[small]) small = h;
        return small;
    }

    private static void swap(int[] num, int h, int s){
        int hold = num[h];
        num[h] = num[s];
        num[s] = hold;
    }
}
