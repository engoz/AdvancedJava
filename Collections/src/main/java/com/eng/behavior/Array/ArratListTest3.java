package com.eng.behavior.Array;

import java.util.List;

public class ArratListTest3 {

    public static void main(String[] args) {
        Error error1 = new Error(1, "Error - 1");
        Error error2 = new Error(2, "Error - 2");

        Message message1 = new Message(1, "Message-1");

        List<Error> msgErr1 = message1.getError();

        msgErr1.add(error1);
        msgErr1.add(error2);

        for (Error msgErr : message1.getError()) {
            System.out.println(msgErr);
        }


    }
}
