package com.eng.videoLessons.model;


import com.eng.videoLessons.inf.PersonInterface;

/**
 * Created by enginoz on 26/10/17.
 */
public class Person implements PersonInterface {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getInfo() {
        return name + "( " + age + " )";
    }
    



    public static int compareAge(Person p1, Person p2) {
        Integer age1 = p1.getAge();
        return age1.compareTo(p2.getAge());
    }
}
