package com.eng.clazz;


import sun.reflect.ReflectionFactory;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class ObjectType {

    static BigDecimal id = new BigDecimal(1);
    static BigDecimal t;
    public static void main(String[] args) {
        System.out.println(id.getClass().getTypeName());
        System.out.println(ReflectionFactory.getReflectionFactory().readObjectForSerialization(t.getClass()));
    }
}
