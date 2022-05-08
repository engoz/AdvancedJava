package com.eng.qualifiers.ex1;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by servicium on 31.12.2015.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.PARAMETER,ElementType.FIELD, ElementType.METHOD})
public @interface ServiceType {
    public enum Type{
        BASIC, PREMIUM
    }

    Type value();
}
