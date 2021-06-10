package com.eng.videoLessons.app;

import com.eng.videoLessons.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by enginoz on 26/10/17.
 */
public class PredicateLamda {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("engin", 42));
        personList.add(new Person("can", 6));
        personList.add(new Person("ozlem", 36));


        Predicate<Person> predOlder = (p) -> p.getAge() > 34;
        Predicate<Person> predYounger = (p) -> p.getAge() < 34;

        displayPeople(personList, predOlder);
        displayPeople(personList, predYounger);

    }

    private static void displayPeople(List<Person> personList, Predicate<Person> predicate) {
        personList.forEach(person -> {
            if (predicate.test(person)) System.out.println(person);
        });
    }
}
