package com.eng.opt;

import java.util.Optional;

public class TestOptional {

    public static void main(String[] args) {
        Integer numara = null;

        Optional<Integer> opt = Optional.ofNullable(numara);

        opt.ifPresent(num -> {
            Double karesi = Math.pow(num, 2);
            System.out.println("Sonuç: " + karesi);
        });

        if (!opt.isPresent()) {
            System.out.println("bulunamadı");
        }
    }
}
