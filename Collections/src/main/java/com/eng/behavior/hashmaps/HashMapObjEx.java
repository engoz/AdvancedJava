package com.eng.behavior.hashmaps;

import java.util.*;

public class HashMapObjEx {

    public static void main(String[] args) {
        Map<Book, Double> books = new HashMap<>(10,0.75f);
        for (int i=0; i<100; i++){
            Book engin_book = new Book(i, "Engin Book", 11.25);
           // System.out.println(engin_book.hashCode());
            books.put(engin_book,11.25);
        }
        System.out.println("Size " + books.size());
        Set entries = books.entrySet();
        Iterator iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry next = (Map.Entry)iterator.next();
            System.out.println(next.hashCode() +" " + next.getKey() +" "+ next.getValue() );
        }
    }

}

class Book{
    Integer id;
    String name;
    Double price;

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getId(), book.getId()) && Objects.equals(getName(), book.getName()) && Objects.equals(getPrice(), book.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPrice());
    }
}
