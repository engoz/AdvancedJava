package com.eng.stream.mkyong;

import java.util.Arrays;
import java.util.List;

/**
 * Created by enginoz on 14/10/17.
 */
public class FindPerson {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result = getStudentByName(persons, "jack");
        System.out.println(result.getName() + " " + result.getAge());

        Person result2 = getStudentByName8(persons, "jack");
        System.out.println(result2.getName() + " " + result2.getAge());

    }

    private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }

    private static Person getStudentByName8(List<Person> persons, String name) {
        Person result = persons.stream().filter(x -> name.equals(x.getName())).findAny().orElse(null);
        return result;
    }
}
