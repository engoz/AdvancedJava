package com.eng.stream;

import com.eng.stream.teachprimer.User;


import java.util.Arrays;
import java.util.List;

public class ReduceEx2 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
     /*
        int computedAges = users.stream().reduce(0, (partialAgeResult, user) -> {
            return partialAgeResult + user.getAge();
        });
*/

        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);

        int result = users.stream()
                .reduce(0, (partialAgeResult, user) -> partialAgeResult + user.getAge(), Integer::sum);

    }
}
