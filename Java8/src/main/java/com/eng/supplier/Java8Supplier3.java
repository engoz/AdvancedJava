package com.eng.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Java8Supplier3 {
    public static void main(String[] args) {

        Developer obj = factory(Developer::new);
        System.out.println(obj.getName());

        Developer obj2 = factory(() -> new Developer("engin"));
        System.out.println(obj2.getName());

    }

    public static Developer factory(Supplier<? extends Developer> s) {

        Developer developer = s.get();
        if (developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("default");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.of(2017, 8, 8));

        return developer;

    }
}
