package com.eng.stream.mkyong;

import java.util.Arrays;
import java.util.List;

/**
 * Created by enginoz on 14/10/17.
 */
public class FindPeopleMultipleCondition {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );

        Person result = getStudentByName1(persons, "jack", 20);
        System.out.println(result.getName() + " " + result.getAge());

        Person result2 = getStudentByName2(persons, "jack", 30);
        if (result2 != null) {
            System.out.println(result2.getName() + " " + result2.getAge());
        }

    }

    private static Person getStudentByName1(List<Person> persons, String name, int age) {

        Person result = persons.stream().filter((p) -> name.equals(p.getName()) && p.getAge() == age).findAny().orElse(null);
        return result;
    }

    private static Person getStudentByName2(List<Person> persons, String name, int age) {
        Person result = persons.stream().filter(x -> {
            if (name.equals(x.getName()) && age == 20) {
                return true;
            }
            return false;
        }).findAny().orElse(null);
        return result;
    }

}
