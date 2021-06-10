package com.eng.stream.teachprimer;

@FunctionalInterface
public interface UserFunction<T> {
    T addUser(String name, Integer age);
}
