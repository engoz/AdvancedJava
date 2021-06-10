package com.eng.stream.teachprimer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MapExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Engin", "Ozlem", "Can", "Zeki", "Remziye", "Nilgun", "Nihal");

        names.stream().map(User::new).forEach(new Consumer<User>() {
            @Override
            public void accept(User x) {
                System.out.println(x);
            }
        });

        names.stream().filter(MapExample2::equalsName)
                .map(User::new)
                .forEach(System.out::println);

        List<User> userList = names.stream().filter(MapExample2::equalsName)
                .map(name -> new User(name))
                .collect(Collectors.toList());
    }

    private static boolean equalsName(String name) {
        return !name.equals("Engin");
    }
}
