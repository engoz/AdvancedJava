package com.eng.behavior.nutrient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

/**
 * Created by enginoz on 4/10/16.
 */
public class ParseNutrient5 {

    private static final char columnDelimiter = '^';
    private static final String stringDelimiter = "~";
    private static final String nullOrBlank = "~~";
    private static final String nullOrBlank2 = "^^";
    private static StreamTokenizer st;


    public static void main(String[] args) {


        String fileName = "new.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((br.readLine()) != null) {
                st = new StreamTokenizer(br);
                st.ordinaryChar(columnDelimiter);
                parse();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void parse() throws IOException {
        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            switch (st.ttype) {
                case StreamTokenizer.TT_EOF:
                    break;
                case StreamTokenizer.TT_WORD:
                    System.out.println("Karakter " + st.sval);
                case StreamTokenizer.TT_NUMBER:
                    System.out.println("Sayi " + st.nval);
            }
        }
    }
}
