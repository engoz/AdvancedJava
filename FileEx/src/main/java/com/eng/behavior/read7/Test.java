package com.eng.behavior.read7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by enginoz on 4/10/16.
 */
public class Test {

    private static final String columnDelimiter = "^";
    private static final String stringDelimiter = "~";


    public static void main(String[] args) {


        String fileName = "ABBREV.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
