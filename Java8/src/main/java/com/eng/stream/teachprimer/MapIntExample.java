package com.eng.stream.teachprimer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapIntExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Engin", "Ozlem", "Can", "Zeki", "Remziye", "Nilgun", "Nihal");

        names.forEach(name -> {
            User user = new User(name);
            System.out.println(user);
        });

        names.stream().filter(MapIntExample::equalsName)
                .map(User::new)
                .forEach(System.out::println);

        List<User> userList = names.stream().filter(MapIntExample::equalsName)
                .map(User::new)
                .collect(Collectors.toList());

        int sum = userList.stream().mapToInt(User::getAge).sum();
        System.out.println(sum);
    }

    private static boolean equalsName(String name) {
        return !name.equals("Engin");
    }
}
