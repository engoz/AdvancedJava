package com.eng.fonc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by servicium on 20.11.2015.
 */
public class App {

    public static void listele(String e) {
        System.out.println(e);
    }

    public static void main(String[] args) {
        Consumer<String> consumer = App::listele;

        consumer.accept("Engin");

        List<String> names = Arrays.asList("Ali", "Veli", "Selam");
        names.forEach(App::listele);

        names.forEach(System.out::println);

    }

}
