package com.eng.stream.teachprimer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author engin.oz
 */
public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Engin", "Ozlem", "Can", "Zeki", "Remziye", "Nilgun", "Nihal");
        names.stream().filter(MapExample::isNotEngin).map(User::new).forEach(System.out::println);
        System.out.println("Functional Style");

        List<User> userList = names.stream().filter(MapExample::isNotEngin).map(User::new).collect(Collectors.toList());
        System.out.println("Functional Style");


    }

    private static boolean isNotEngin(String name) {
        return !name.equals("Engin");
    }
}
