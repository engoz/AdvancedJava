package com.eng.behavior;

import java.io.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadLogFile {

    private static final String columnDelimiter = "";
    private static final String stringDelimiter = "|";
    private static final DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss:SSS ZZ");
    private static final DateFormat filterDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public static void main(String[] args) throws FileNotFoundException {


        String fileName = "/Users/enginoz/Musteri/Fibabank/log/stomp.log.17-02-2021";
        File fout = new File("XAGTRY_17.02.2021.txt");
        FileOutputStream fos = new FileOutputStream(fout);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

        //"{NOW}|{DATE}|{DIFF} : {SYMBOL} => BID = {BID}, ASK = {ASK}";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = br.readLine()) != null) {
                Price price = getPrice(line);

                Date start = filterDateFormat.parse("17.02.2021 00:00:00");
                Date end = filterDateFormat.parse("17.02.2021 23:59:59");
                if (price.getInsertDate().compareTo(start) >= 0 && price.getInsertDate().compareTo(end) < 0 && price.getSymbol().equals("XAG/TRY")) {

                    bw.write(price.toString());
                    bw.newLine();

                    if (price.getAskPrice().compareTo(new BigDecimal("5.5")) <= 0) {
                        System.out.println(price);
                    }


                }
            }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static Price getPrice(String line) {
        try {
            String[] split = line.split("\\|");
            String stringDate = split[1];
            Price price = getSymbolPrice(split[2]);
            Date insertDate = null;
            insertDate = parseDate(stringDate);
            price.setInsertDate(insertDate);
            return price;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static Price getSymbolPrice(String s) {
        String replacemet = s.replace(":", "|").replace("=>", "|").replace("=", "|").replace(",", "|");
        String[] split = replacemet.split("\\|");
        Price price = new Price();
        price.setSymbol(split[1].trim());
        price.setBidPrice(new BigDecimal(split[3].trim()));
        price.setAskPrice(new BigDecimal(split[5].trim()));
        return price;
    }

    private static Date parseDate(String date) throws ParseException {
        return dateFormat.parse(date);
    }

    private static class Price {
        private Date insertDate;
        private String symbol;
        private BigDecimal bidPrice;
        private BigDecimal askPrice;

        public Date getInsertDate() {
            return insertDate;
        }

        public void setInsertDate(Date insertDate) {
            this.insertDate = insertDate;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public BigDecimal getBidPrice() {
            return bidPrice;
        }

        public void setBidPrice(BigDecimal bidPrice) {
            this.bidPrice = bidPrice;
        }

        public BigDecimal getAskPrice() {
            return askPrice;
        }

        public void setAskPrice(BigDecimal askPrice) {
            this.askPrice = askPrice;
        }

        @Override
        public String toString() {
            return "Price{" +
                    "insertDate=" + insertDate +
                    ", symbol='" + symbol + '\'' +
                    ", bidPrice=" + bidPrice +
                    ", askPrice=" + askPrice +
                    '}';
        }
    }

}
