package com.eng.videoLessons.inf;


import com.eng.videoLessons.model.Person;

/**
 * Created by enginoz on 2.01.2018.
 */
public interface PersonInterface {

    String getName();

    void setName(String name);

    int getAge();

    void setAge(int age);

    default String displayPersonInfo() {
        return getName() + " (" + getAge() + ")";
    }

    static String getPersonInfo(Person p) {
        return p.getName() + " (" + p.getAge() + ")";
    }
}

