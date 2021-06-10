package com.eng.behavior.Array;

import java.util.ArrayList;
import java.util.List;

public class ListPassEx {

    static void changeValue(List<Detay> list) {

        for (Detay d : list) {
            if (d.getName().equals("Engin")) {
                d.setYas(44);
            }
        }
    }


    public static void main(String[] args) {
        List<Detay> list = new ArrayList<>();
        list.add(new Detay("Engin", "Oz", 45));
        list.add(new Detay("Can", "Oz", 5));
        list.add(new Detay("Ozlem", "Oz", 38));
        list.add(new Detay("Asya", "Oz", 1));
        changeValue(list);
        list.forEach(System.out::println);

    }

    private static class Detay {
        String name;
        String surname;
        Integer yas;

        public Detay(String name, String surname, Integer yas) {
            this.name = name;
            this.surname = surname;
            this.yas = yas;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public Integer getYas() {
            return yas;
        }

        public void setYas(Integer yas) {
            this.yas = yas;
        }

        @Override
        public String toString() {
            return "Detay{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", yas=" + yas +
                    '}';
        }
    }
}
