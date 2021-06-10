package com.eng.behavior;

import java.io.*;
import java.text.ParseException;
import java.util.Date;

public class FelixParse {

    public static void main(String[] args) throws FileNotFoundException {


        String fileName = "/Users/enginoz/Musteri/Fibabank/log/integral_incoming.log.2021-01-18";
        //File fout = new File("XAGTRY_19.01.2021.txt");
        //FileOutputStream fos = new FileOutputStream(fout);

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        //"{NOW}|{DATE}|{DIFF} : {SYMBOL} => BID = {BID}, ASK = {ASK}";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                //String[] s = line.split(" ");
                if (i < 5) {
                    // System.out.println(s[0] + " " + s[1]);
                    System.out.println(line);
                }
                i++;

            }
            // bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
