package com.eng.behavior.Array;

public class ArraySortEx1 {


    public static void main(String[] args) {
        int[] a={10,20,1,5,4,20,6,4,2,5,4,6,8,-5,-1};
        a=sort(a);
        for(int i:a) {
            System.out.print(i + ",");
        }
    }
    public static int[] sort(int[] a){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                int temp=0;
                //System.out.println("Compare a["+i+"] = "+a[i]+" "+"a["+j+"] = "+a[j]);
                if(a[i]<a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;

    }
}
