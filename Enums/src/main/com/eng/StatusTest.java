package com.eng;

import java.awt.*;
import java.util.stream.Stream;

/**
 * Created by servicium on 23.11.2016.
 */
public class StatusTest {
    public static void main(String[] args) {

        System.out.println("CANCELLED ORDINAL " + Status.CANCELLED.ordinal());
        for (Status s:Status.values()) {
            System.out.println("ALL Values " + s.name());
        }

    }
}
