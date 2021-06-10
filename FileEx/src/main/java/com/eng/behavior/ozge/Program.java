package com.eng.behavior.ozge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {

        kategoriOlustur();
        urunOlustur();

    }

    private static void kategoriOlustur() {
        File file = new File("katalog.txt");
        {
            try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
                br.write("Bilgisayar");
                br.newLine();
                br.write("Beyaz Esya");
                br.newLine();
                br.write("Televizyon");
                br.newLine();
                br.write("Akıllı Saat");
            } catch (IOException e) {
                System.out.println("Unable to read file " + file.toString());
            }
        }
    }

    private static void urunOlustur() {
        File televizyon = new File("televizyon.txt");
        {
            try (BufferedWriter br = new BufferedWriter(new FileWriter(televizyon))) {
                br.write("Tüplü televizyon");
                br.newLine();
                br.write("LCD televizyon");
            } catch (IOException e) {
                System.out.println("Unable to read file " + televizyon.toString());
            }
        }
    }
}


