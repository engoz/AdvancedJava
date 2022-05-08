package com.eng.atomic;

public class Donation {
    public static void main(String[] args) {
        System.out.println("Current:" + MoneyBox.sum);

        new Benefactor("Mehmet", 20L);
        new Benefactor("Ayşe", 15L);
        new Benefactor("Veli", 30L);
        new Benefactor("Onur", 5L);

        while(Thread.activeCount() > 1);

        System.out.println("Accumulated Sum:" + MoneyBox.sum);
    }
}
