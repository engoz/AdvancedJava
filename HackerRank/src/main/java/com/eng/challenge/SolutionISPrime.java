package com.eng.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'isPrime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static int isPrime(long n) {
        // Write your code here
        if(n == 2){
            return 1;
        } else if (n % 2 == 0){
            return 2;
        }

        int sqrt = (int)Math.sqrt(n);
        for(int i=3; i<=sqrt; i +=2){
            if(n % i == 0){
                return i;
            }
        }
        return 1;
    }

}

public class SolutionISPrime {
    public static void main(String[] args) throws IOException {
    //    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    //    long n = Long.parseLong(bufferedReader.readLine().trim());

        int result = Result.isPrime(2047);
        System.out.println(result);

    //    bufferedWriter.write(String.valueOf(result));
    //    bufferedWriter.newLine();

    //    bufferedReader.close();
    //    bufferedWriter.close();
    }
}

