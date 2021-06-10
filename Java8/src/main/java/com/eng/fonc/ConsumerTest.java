package com.eng.fonc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by servicium on 20.11.2015.
 */
public class ConsumerTest {

    public static void main(String[] args) {

        //Normal Yontem
        Consumer<String> consumerNormal = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumerNormal.accept("Normal Yontem");

        //Lamda Y�ntem
        Consumer<String> consumerLamda = (String msg) -> {
            System.out.println(msg);
        };

        consumerLamda.accept("Lamda Yontem");

        //Akilli Yontem
        Consumer<String> consumerLamda2 = (msg) -> {
            System.out.println(msg);
        };

        consumerLamda2.accept("Akilli Yontem");

        List<String> names = Arrays.asList("Ali", "Veli", "Selam");

        names.forEach(consumerLamda2);

        names.forEach(e -> {
            System.out.println(e);
        });


    }
}
