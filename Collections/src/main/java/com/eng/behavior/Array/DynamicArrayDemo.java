package com.eng.behavior.Array;

/**
 * Created by enginoz on 14.12.2017.
 */
public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArrayObject arrayDemo = new DynamicArrayObject();
        DynamicArray<Integer> dynamicArray = arrayDemo.getDynamicArray();
        dynamicArray.put(11);
        dynamicArray.put(12);
        System.out.println("Size " + dynamicArray.getSize());
        dynamicArray.put(13);
        dynamicArray.put(14);
        System.out.println("Size " + dynamicArray.getSize());
        dynamicArray.put(15);
        System.out.println("Size " + dynamicArray.getSize());
        for (int i = 0; i < arrayDemo.getDynamicArray().getSize(); i++) {
            System.out.println(dynamicArray.get(i));
        }

    }
}
