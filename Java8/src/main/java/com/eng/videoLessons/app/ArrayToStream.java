package com.eng.videoLessons.app;

import com.eng.videoLessons.model.Person;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by enginoz on 3.01.2018.
 */
public class ArrayToStream {
    public static void main(String[] args) {
        Person[] persons = {new Person("Engin", 45), new Person("Can", 6), new Person("Ozlem", 37)};
        /*
        for (int i=0; i<persons.length; i++){
            System.out.println(person[i].getInfo());
        }
        */

        //Stream<Person> stream = Stream.of(persons);
        Stream<Person> stream = Arrays.stream(persons);
        stream.forEach(p -> System.out.println(p.getInfo()));

    }

}
