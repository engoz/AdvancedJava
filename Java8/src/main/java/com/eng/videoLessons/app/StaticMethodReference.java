package com.eng.videoLessons.app;

import com.eng.videoLessons.model.Person;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by enginoz on 3.01.2018.
 */
public class StaticMethodReference {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Engin", 43));
        people.add(new Person("Can", 6));
        people.add(new Person("Özlem", 37));

        Collections.sort(people, Person::compareAge);
        people.forEach(person -> System.out.println(person));
    }
}
