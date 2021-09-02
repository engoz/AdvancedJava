package com.eng.util;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class JavaUtilTest {

    public static void main(String[] args) {
        List<OrderEntry> orderEntries = new ArrayList<>();
        orderEntries.add(new OrderEntry(10));
        orderEntries.add(new OrderEntry(14));
        orderEntries.add(new OrderEntry(12));
        orderEntries.add(new OrderEntry(18));

        IntSummaryStatistics stats = orderEntries.stream()
                .mapToInt(x -> x.getAmount()).summaryStatistics();

        IntSummaryStatistics stats2 = orderEntries.stream().collect(
                Collectors.summarizingInt(OrderEntry::getAmount));

        // average
        System.out.println(stats.getAverage());

        // count
        System.out.println(stats.getCount());

        // max
        System.out.println(stats.getMax());

        // min
        System.out.println(stats.getMin());

        // sum
        System.out.println(stats2.getSum());

        // average
        System.out.println(stats2.getAverage());

        // count
        System.out.println(stats2.getCount());

        // max
        System.out.println(stats2.getMax());

        // min
        System.out.println(stats2.getMin());

        // sum
        System.out.println(stats2.getSum());
    }
}

class OrderEntry {

    int amount;

    public OrderEntry(int amount) {
        super();
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
