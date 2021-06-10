package com.eng.videoLessons.app;

import com.eng.videoLessons.model.Person;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by enginoz on 3.01.2018.
 */
public class InstanceMethodReference {
    public static void main(String[] args) {
        InstanceMethodReference mainClass = new InstanceMethodReference();
        mainClass.sortData();
    }

    public void sortData() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Engin", 43));
        people.add(new Person("Can", 6));
        people.add(new Person("Özlem", 37));

        Collections.sort(people, this::compareAge);
        people.forEach(System.out::println);
    }

    public int compareAge(Person p1, Person p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }
}
