package com.eng.challenge;

import java.util.Scanner;

public class RepeatedString {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long aCount = repatedString(s,n);
        System.out.println(aCount);
        sc.close();
    }

    private static long repatedString(String s, long n) {
        int strLength = s.length();
        long q = 0, r = 0;
        q = n / strLength;
        r = n % strLength;
        System.out.println("Long degerler "+ q + " and " + r);
        long partialStrLen = (r == 0) ? 0 : r;
        long aCount = q * getLetterCount(s, s.length()) + getLetterCount(s, partialStrLen);
        return aCount;
    }

    private static long getLetterCount(String s, long length) {
        long count = 0;
        for (int i=0 ; i<length; i++){
            if (s.charAt(i) == 'a')
                count++;
        }
        return count;
    }
}
