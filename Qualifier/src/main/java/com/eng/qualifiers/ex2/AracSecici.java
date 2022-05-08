package com.eng.qualifiers.ex2;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by servicium on 31.12.2015.
 */
@Target({ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier //Secici ozellik katılıyor
public @interface AracSecici {
    Araclar secBirini();
}
