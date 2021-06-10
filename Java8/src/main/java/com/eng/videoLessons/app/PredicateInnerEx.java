package com.eng.videoLessons.app;


import com.eng.videoLessons.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by enginoz on 26/10/17.
 */
public class PredicateInnerEx {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("engin", 42));
        personList.add(new Person("can", 6));
        personList.add(new Person("ozlem", 36));

        Predicate<Person> pred = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {

                return person.getAge() > 35;
            }
        };

        for (Person person : personList) {
            if (pred.test(person)) {
                System.out.println(person.getName());
            }
        }
    }
}
