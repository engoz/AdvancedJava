package com.eng.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class ResultE {

    /*
     * Complete the 'closestSquaredDistance' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY x
     *  2. INTEGER_ARRAY y
     */

    public static long closestSquaredDistance(List<Integer> x, List<Integer> y) {
        // Write your code here
        int xSize = x.size();
        int ySize = y.size();
        double sum = 0;
        List<Points> points = new ArrayList<Points>();
        for(int i=0; i<xSize; i++){
            Points p = new Points(x.get(i),y.get(i));
            points.add(p);
        }

        for(int i = points.size()-1; i>0; i -=2){
            Points po =  points.get(i-1);
            Points pn = points.get(i);
            double xP = Math.pow((pn.x -po.x),2);
            double yP = Math.pow((pn.y -po.y),2);
            double r = xP + yP;
            sum += r;
        }
        return (int) sum;
    }



}

class Points{
    int x;
    int y;

    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

     //   int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> x = new ArrayList<>();

    //    for (int i = 0; i < xCount; i++) {
    //        int xItem = Integer.parseInt(bufferedReader.readLine().trim());
    //        x.add(xItem);
    //    }

     //   int yCount = Integer.parseInt(bufferedReader.readLine().trim());

        x.add(77);
        x.add(1000);
        x.add(992);
        x.add(1000000);

        List<Integer> y = new ArrayList<>();
        y.add(0);
        y.add(1000);
        y.add(500);
        y.add(0);

      //  for (int i = 0; i < yCount; i++) {
      //      int yItem = Integer.parseInt(bufferedReader.readLine().trim());
      //      y.add(yItem);
      //  }

        long result = ResultE.closestSquaredDistance(x, y);
        System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

      //  bufferedReader.close();
      //  bufferedWriter.close();
    }
}
