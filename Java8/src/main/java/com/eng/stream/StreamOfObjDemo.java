package com.eng.stream;

import java.util.stream.Stream;

public class StreamOfObjDemo {
    public static void main(String[] args) {
        Stream<User> userStream = Stream.of(
                new User("Mahesh", 22),
                new User("Krishn", 20),
                new User("Suresh", 25)
        );
        userStream.forEach(u -> System.out.println(u.getUserName()));
    }
}
class User {
    private String userName;
    private int age;
    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Sets and Gets
}
