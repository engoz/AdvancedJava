package com.eng.behavior.nutrient;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by enginoz on 4/10/16.
 */
public class ParseNutrient4 {
    private static final String columnDelimiter = "^";
    private static final String stringDelimiter = "~";
    private static final String nullOrBlank = "~~";
    private static final String nullValue = "^^";
    private static StringTokenizer st;
    private static Map<Integer, FoodDestination> foodDestinationMap = new HashMap<>();
    private static Map<Integer, Weight> weightMap = new HashMap<>();
    private static Map<Integer, NutrientData> nutrientDataMap = new HashMap<>();


    public static void main(String[] args) {
        writeWeight();
        //writeFoodDestAndData();
    }

    private static void writeWeight() {

        new Thread("ReadWeight") {
            @Override
            public void run() {
                weightMap = parseWeigth();
                writeWeightMap(weightMap);
            }
        }.start();


    }

    private static void writeFoodDestAndData() {

        new Thread("Food Destination") {
            @Override
            public void run() {
                foodDestinationMap = parseFoodDestination();
                nutrientDataMap = parseNutrientData();
                mergeToMapAndWriteTSV(foodDestinationMap, nutrientDataMap);
            }
        }.start();


    }

    public static void writeWeightMap(Map<Integer, Weight> weightMap) {
        if (weightMap.size() > 0) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("weight.tsv")))) {
                for (Map.Entry<Integer, Weight> entry : weightMap.entrySet()) {
                    Weight weight = entry.getValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(entry.getKey());
                    sb.append('\t');
                    sb.append(weight.getNdbNo());
                    sb.append('\t');
                    sb.append(weight.getSequence());
                    sb.append('\t');
                    sb.append(weight.getAmount());
                    sb.append('\t');
                    sb.append(weight.getUnits());
                    sb.append('\t');
                    sb.append(weight.getGrams());
                    sb.append('\n');
                    bw.write(sb.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static void mergeToMapAndWriteTSV(Map<Integer, FoodDestination> foodDestinationMap, Map<Integer, NutrientData> nutrientDataMap) {
        if (foodDestinationMap.size() > 0 && nutrientDataMap.size() > 0) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("db.tsv")))) {
                for (Map.Entry<Integer, FoodDestination> entry : foodDestinationMap.entrySet()) {
                    FoodDestination foodDestination = entry.getValue();
                    NutrientData nutrationData = nutrientDataMap.get(entry.getKey());
                    if (foodDestination != null && nutrationData != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(foodDestination.getNdbNo());
                        sb.append('\t');
                        sb.append(foodDestination.getFoodGroup());
                        sb.append('\t');
                        sb.append(foodDestination.getLongDecs());
                        sb.append('\t');
                        sb.append(foodDestination.getShrtDesc());
                        sb.append('\t');
                        sb.append(foodDestination.getComName());
                        sb.append('\t');
                        sb.append(foodDestination.getManufacName());
                        sb.append('\t');
                        sb.append(foodDestination.getSurvey());
                        sb.append('\t');
                        sb.append(nutrationData.getNutrNo());
                        sb.append('\t');
                        sb.append(nutrationData.getNutrVal());
                        sb.append('\n');
                        bw.write(sb.toString());
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    private static Map<Integer, FoodDestination> parseFoodDestination() {
        Map<Integer, FoodDestination> tmpTemp = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FoodDestination.FILE_NAME))) {
            String line;
            FoodDestination foodDestination;
            while ((line = br.readLine()) != null) {
                st = new StringTokenizer(line, columnDelimiter);
                foodDestination = new FoodDestination();
                int count = st.countTokens();
                if (count > 0) {
                    for (int i = 0; i < count; i++) {
                        String s = st.nextToken();
                        switch (i) {
                            case FoodDestination.NDB_NO:
                                if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                    s = s.substring(1, s.length() - 1);
                                    foodDestination.setNdbNo(Integer.parseInt(s));
                                }
                            case FoodDestination.FOOD_GROUP:
                                if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                    s = s.substring(1, s.length() - 1);
                                    foodDestination.setFoodGroup(Integer.parseInt(s));
                                }
                                break;
                            case FoodDestination.LONG_DESC:
                                if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                    s = s.substring(1, s.length() - 1);
                                    foodDestination.setLongDecs(s);
                                }
                                break;
                            case FoodDestination.SHRT_DESC:
                                if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                    s = s.substring(1, s.length() - 1);
                                    foodDestination.setShrtDesc(s);
                                }
                                break;
                            case FoodDestination.COM_NAME:
                                foodDestination.setComName(s);
                                break;
                            case FoodDestination.MANUFACNAME:
                                foodDestination.setManufacName(s);
                                break;
                            case FoodDestination.SURVEY:
                                foodDestination.setSurvey(s);
                                break;
                            default:
                                break;

                        }
                    }
                }
                tmpTemp.put(foodDestination.getNdbNo(), foodDestination);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return tmpTemp;
    }


    private static Map<Integer, Weight> parseWeigth() {
        Map<Integer, Weight> tmpTemp = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(Weight.FILE_NAME))) {
            String line;
            Weight weight;
            int id = 0;
            while ((line = br.readLine()) != null) {
                st = new StringTokenizer(line, columnDelimiter);
                weight = new Weight();
                int count = st.countTokens();
                for (int i = 0; i < count; i++) {
                    String s = st.nextToken();
                    switch (i) {
                        case Weight.NDB_NO:
                            if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                s = s.substring(1, s.length() - 1);
                                weight.setNdbNo(Integer.parseInt(s));
                            }
                        case Weight.SEQ:
                            weight.setSequence(Integer.parseInt(s));
                            break;
                        case Weight.AMOUNT:
                            weight.setAmount(Double.parseDouble(s));
                            break;
                        case Weight.UNITS:
                            if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                s = s.substring(1, s.length() - 1);
                                weight.setUnits(s);
                            }
                            break;
                        case Weight.GRAMS:
                            weight.setGrams(Double.parseDouble(s));
                            break;
                        default:
                            break;

                    }
                }
                tmpTemp.put(id++, weight);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return tmpTemp;
    }


    private static Map<Integer, NutrientData> parseNutrientData() {
        Map<Integer, NutrientData> tmpTemp = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(NutrientData.FILE_NAME))) {
            String line;
            NutrientData nutrientData;
            int id = 0;
            while ((line = br.readLine()) != null) {
                st = new StringTokenizer(line, columnDelimiter);
                nutrientData = new NutrientData();
                int count = st.countTokens();
                if (count > 0) {
                    for (int i = 0; i < count; i++) {
                        String s = st.nextToken();
                        switch (i) {
                            case NutrientData.NDB_NO:
                                if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                    s = s.substring(1, s.length() - 1);
                                    nutrientData.setNdbNo(Integer.parseInt(s));
                                }
                            case NutrientData.NUTR_NO:
                                if (s.startsWith(stringDelimiter) && s.endsWith(stringDelimiter)) {
                                    s = s.substring(1, s.length() - 1);
                                    nutrientData.setNutrNo(Integer.parseInt(s));
                                }
                                break;
                            case NutrientData.NUTR_VAL:
                                nutrientData.setNutrVal(Double.parseDouble(s));

                            default:
                                break;

                        }
                    }
                    tmpTemp.put(nutrientData.getNdbNo(), nutrientData);
                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return tmpTemp;
    }


    protected static class FoodDestination {
        public static final String FILE_NAME = "FOOD_DES.txt";
        public static final int NDB_NO = 0;
        public static final int FOOD_GROUP = 1;
        public static final int LONG_DESC = 2;
        public static final int SHRT_DESC = 3;
        public static final int COM_NAME = 4;
        public static final int MANUFACNAME = 5;
        public static final int SURVEY = 6;

        private int ndbNo;
        private int foodGroup;
        private String longDecs;
        private String shrtDesc;
        private String comName;
        private String manufacName;
        private String survey;


        public int getNdbNo() {
            return ndbNo;
        }

        public void setNdbNo(int ndbNo) {
            this.ndbNo = ndbNo;
        }

        public int getFoodGroup() {
            return foodGroup;
        }

        public void setFoodGroup(int foodGroup) {
            this.foodGroup = foodGroup;
        }

        public String getLongDecs() {
            return longDecs;
        }

        public void setLongDecs(String longDecs) {
            this.longDecs = longDecs;
        }

        public String getShrtDesc() {
            return shrtDesc;
        }

        public void setShrtDesc(String shrtDesc) {
            this.shrtDesc = shrtDesc;
        }

        public String getComName() {
            return comName;
        }

        public void setComName(String comName) {
            this.comName = comName;
        }

        public String getManufacName() {
            return manufacName;
        }

        public void setManufacName(String manufacName) {
            this.manufacName = manufacName;
        }

        public String getSurvey() {
            return survey;
        }

        public void setSurvey(String survey) {
            this.survey = survey;
        }
    }

    protected static final class Weight {
        public static final String FILE_NAME = "WEIGHT.txt";
        public static final int NDB_NO = 0;
        public static final int SEQ = 1;
        public static final int AMOUNT = 2;
        public static final int UNITS = 3;
        public static final int GRAMS = 4;

        private int ndbNo;
        private int sequence;
        private double amount;
        private String units;
        private Double grams;

        public int getNdbNo() {
            return ndbNo;
        }

        public void setNdbNo(int ndbNo) {
            this.ndbNo = ndbNo;
        }

        public int getSequence() {
            return sequence;
        }

        public void setSequence(int sequence) {
            this.sequence = sequence;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getUnits() {
            return units;
        }

        public void setUnits(String units) {
            this.units = units;
        }

        public Double getGrams() {
            return grams;
        }

        public void setGrams(Double grams) {
            this.grams = grams;
        }
    }


    protected static final class NutrientData {
        public static final String FILE_NAME = "NUT_DATA.txt";
        public static final int NDB_NO = 0;
        //val = "208" ? ilgileniliyor
        public static final int NUTR_NO = 1;
        public static final int NUTR_VAL = 2;

        private int ndbNo;
        private int nutrNo;
        private double nutrVal;

        public int getNdbNo() {
            return ndbNo;
        }

        public void setNdbNo(int ndbNo) {
            this.ndbNo = ndbNo;
        }

        public int getNutrNo() {
            return nutrNo;
        }

        public void setNutrNo(int nutrNo) {
            this.nutrNo = nutrNo;
        }

        public double getNutrVal() {
            return nutrVal;
        }

        public void setNutrVal(double nutrVal) {
            this.nutrVal = nutrVal;
        }
    }
}
