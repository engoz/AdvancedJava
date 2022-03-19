package com.eng.behavior.collectiongezinme;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by servicium on 19.02.2016.
 */
public class HashMapExample2 {

    public static void main(String[] args) {

        ArrayList<MyObject> objectlist = new ArrayList<MyObject>();

        objectlist.add(new MyObject("1", 100, false));
        objectlist.add(new MyObject("2", 100, false));
        objectlist.add(new MyObject("3", 100, true));
        objectlist.add(new MyObject("4", 100, false));

        System.out.println("First Size " + objectlist.size());
        for (Iterator<MyObject> iterator = objectlist.iterator(); iterator.hasNext(); ) {
            MyObject obje = iterator.next();
            if (obje.getDelete() == true) {
                iterator.remove();
            }
            System.out.println(obje.getId() + " - " + obje.getAmaount() + " " + obje.getDelete());
        }

        System.out.println("Last Size " + objectlist.size());
    }

    public static class MyObject {
        private String id;
        private Integer amaount;
        private Boolean delete;

        public MyObject(String id, Integer amaount, Boolean delete) {
            this.id = id;
            this.amaount = amaount;
            this.delete = delete;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getAmaount() {
            return amaount;
        }


        public void setAmaount(Integer amaount) {
            this.amaount = amaount;
        }

        public Boolean getDelete() {
            return delete;
        }

        public void setDelete(Boolean delete) {
            this.delete = delete;
        }
    }
}
