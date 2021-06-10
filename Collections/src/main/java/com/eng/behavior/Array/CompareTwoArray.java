package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author engin.oz
 */
public class CompareTwoArray {
    public static void main(String[] args) {

        Product p1 = new Product(1L, "Bir");
        Product p2 = new Product(2L, "Iki");
        Product p3 = new Product(3L, "Uc");
        Product p4 = new Product(4L, "Dort");


        List<Product> a1 = new ArrayList<>();
        a1.add(p1);
        a1.add(p2);
        a1.add(p3);
        a1.add(p4);

        p1 = new Product(1L, "Degisşmiş Bir");
        p2 = new Product(2L, "Degisşmiş Iki");
        p3 = new Product(3L, "Degisşmiş Uc");
        p4 = new Product(4L, "Degisşmiş Dort");
        Product p5 = new Product(-1L, "Yeni Bes");
        Product p6 = new Product(-1L, "Yeni Alti");

        List<Product> a2 = new ArrayList<>();
        a2.add(p1);
        a2.add(p2);
        a2.add(p3);
        a2.add(p4);
        a2.add(p5);
        a2.add(p6);

        List<Product> newList = new ArrayList<>();


        for (Product dto : a2) {
            outher:
            for (Product entity : a1) {
                if (dto.getId().equals(entity.getId())) {
                    entity.setName(dto.getName());
                    break outher;
                } else if (dto.getId() == -1L) {
                    newList.add(dto);
                    break outher;
                }
            }

        }


        for (Product p : newList) {
            System.out.println(p.getName());
        }

    }


}

class Product {

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    Long id;
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
