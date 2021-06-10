package com.eng.stream.teachprimer;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Engin", 43, Arrays.asList("1", "2")),
                new User("Ozlem", 37, Arrays.asList("3", "4", "5")),
                new User("Can", 7, Arrays.asList("6")),
                new User("Asya", 1, Arrays.asList("7", "8"))
        );
        Optional<Object> any = users.stream().map(user -> user.getPhoneNumbers().stream())
                .flatMap((Function<Stream<String>, Stream<?>>) stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("10")))
                .findAny();


        any.ifPresent(System.out::println);
    }

    private static boolean equalsName(String name) {
        return !name.equals("Engin");
    }
}
