package com.eng.solution;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Solutions {



    static int birthdayCakeCandles(int[] arr){
        int maxCandleHeight = Integer.MIN_VALUE;
        int maxCandleFreqCount = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] == maxCandleHeight){
                maxCandleFreqCount++;
            }
            if (arr[i] > maxCandleHeight){
                maxCandleHeight = arr[i];
                maxCandleFreqCount = 1;
            }
        }
        return maxCandleFreqCount;
    }



    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxCandleHeight = Integer.MIN_VALUE;
        int maxCandleFreqCount = 0;
        for (Integer candle:candles){
            if(candle == maxCandleHeight){
                maxCandleFreqCount++;
            }
            if (candle > maxCandleHeight){
                maxCandleHeight = candle;
                maxCandleFreqCount = 1;
            }
        }
        return maxCandleFreqCount;
    }

}

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = Solutions.birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
