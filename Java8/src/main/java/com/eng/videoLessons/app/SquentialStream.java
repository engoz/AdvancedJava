package com.eng.videoLessons.app;


import com.eng.videoLessons.model.Person;

import java.util.ArrayList;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by enginoz on 3.01.2018.
 */
public class SquentialStream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Engin", 43));
        people.add(new Person("Can", 6));
        people.add(new Person("Özlem", 37));

        Predicate<Person> pred = (p) -> p.getAge() > 34;

        displayPeople(people, pred);


    }

    private static void displayPeople(List<Person> persons, Predicate<Person> predicate) {
        /*
        persons.forEach(person -> {
            if(predicate.test(person)) System.out.println(person);
        });
        */
        persons.stream()
                .filter(predicate)
                .forEach(p -> System.out.println(p.getName()));
    }
}
