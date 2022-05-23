package main;

import java.util.Arrays;

public class RejectReasonTest {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(RejectReason.values()));
        RejectReason reason = RejectReason.P;
        System.out.println(reason.name());

    }
}
