package com.eng.behavior.nutrient;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * Created by enginoz on 4/10/16.
 */
public class ParseNutrient7 {

    private static final String columnDelimiter = "^";
    private static final String stringDelimiter = "~";
    private static final String nullOrBlank = "~~";
    private static final String nullOrBlank2 = "^^";
    private static StringTokenizer st;


    public static void main(String[] args) {


        String fileName = "new.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                st = new StringTokenizer(line);
                st.nextToken(columnDelimiter);
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                        s = s.substring(1, s.length() - 1);
                        System.out.println(s);
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
