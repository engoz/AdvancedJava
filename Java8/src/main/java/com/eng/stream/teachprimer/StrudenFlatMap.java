package com.eng.stream.teachprimer;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StrudenFlatMap {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");

        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");

        List<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);

        List<String> collect = (List<String>) list.stream()
                .map(student -> student.getBook())
                .flatMap(x -> ((Set) x).stream())
                .distinct()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
