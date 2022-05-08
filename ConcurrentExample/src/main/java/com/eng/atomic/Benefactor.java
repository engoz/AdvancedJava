package com.eng.atomic;

public class Benefactor implements Runnable {

    String name;
    Long   donationMoney;

    public Benefactor(String name, Long donationMoney) {
        this.name = name;
        this.donationMoney = donationMoney;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.printf("[NEW DONATE]: Accumulated sum:%s %s donates %d\n", MoneyBox.sum.getAndAdd(donationMoney), name, donationMoney);
    }
}

