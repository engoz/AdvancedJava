package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEx {

    static String[] a = new String[]{"A", "B"};

    public static void main(String[] args) {
        System.out.println(Arrays.stream(a));
        System.out.println(a[0]);
    }
}
