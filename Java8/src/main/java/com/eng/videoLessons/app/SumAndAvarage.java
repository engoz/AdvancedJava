package com.eng.videoLessons.app;

import com.eng.videoLessons.model.Person;


import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Created by enginoz on 3.01.2018.
 */
public class SumAndAvarage {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Engin", 43));
        people.add(new Person("Can", 6));
        people.add(new Person("Özlem", 37));

        int sum = people.stream().mapToInt(p -> p.getAge()).sum();
        System.out.println("Total of Ages " + sum);
        OptionalDouble avg = people.stream().mapToDouble(p -> p.getAge()).average();
        if (avg.isPresent()) {
            System.out.println("Average " + avg.getAsDouble());
        } else {
            System.out.println("Average wasn't calculated ");
        }
    }
}
