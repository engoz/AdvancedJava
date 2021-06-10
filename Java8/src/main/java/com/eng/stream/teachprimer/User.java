package com.eng.stream.teachprimer;

import java.util.List;

public class User {

    private String name;
    private Integer age = 30;
    private List<String> phoneNumbers;

    public User(String name) {
        this.name = name;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, Integer age, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Name :" + name + " Age : " + age;
    }
}
