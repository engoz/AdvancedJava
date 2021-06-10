package com.eng.behavior.nutrient;

import java.io.*;

/**
 * Created by enginoz on 4/10/16.
 */
public class ParseNutrient6 {

    private static final char columnDelimiter = '^';
    private static final char stringDelimiter = '~';
    private static final String nullOrBlank = "~~";
    private static final String nullOrBlank2 = "^^";

    public void readfile(String filename) {
        InputStream is = null;
        BufferedInputStream bis = null;
        File file = new File(filename);
        if (file.exists()) {
            try {
                is = new FileInputStream(filename);
                bis = new BufferedInputStream(is); //2048 blok
                int b;
                long basla = System.currentTimeMillis();
                while ((b = bis.read()) != -1) {
                    char a = (char) b;
                    if (a == stringDelimiter) {
                        a = ' ';
                    }
                    System.out.print((char) a);

                }
                long fark = System.currentTimeMillis() - basla;
                System.out.println(fark);

            } catch (IOException e) {
                // TODO: handle exception
                System.err.println(e);
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new ParseNutrient6().readfile("new.txt");
    }
}
