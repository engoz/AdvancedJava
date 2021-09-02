package com.eng.java7;

import com.eng.java7.util.CustomResource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) throws Exception {
        beforeJava7();
        withJava7();
        withCustomResInJava7();
    }

    private static void withCustomResInJava7() throws Exception {
        try(CustomResource cr = new CustomResource()){
            cr.readFromResource();
        }
    }

    private static void withJava7() throws IOException {
        String file = "/Users/enginoz/Works/AdvancedJava/eng.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) !=null){
                System.out.println(sCurrentLine);
            }
        }
    }

    private static void beforeJava7() throws IOException {
        System.out.println("Before Java7");
        BufferedReader br = null;
        String file = "/Users/enginoz/Works/AdvancedJava/eng.txt";
        try {
            br = new BufferedReader(new FileReader(file));
            String sCurrentLine;
            while ((sCurrentLine=br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
        }finally {
            br.close();
        }
    }
}
