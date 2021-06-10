package com.eng.realyimp;

import java.util.Comparator;

/**
 * @author engin.oz
 */
public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }

    public static void main(String[] args) {
        String first = "Merhaba";
        String second = "Engin";

    }
}
