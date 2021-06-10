package com.eng.stream.teachprimer;

@FunctionalInterface
public interface UserAddFunction<T, R> {
    R addUser(T t);
}
