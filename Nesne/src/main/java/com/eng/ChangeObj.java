package com.eng;

class Forcast{
    public int temp;
    public int press;
}

public class ChangeObj {
    public static void main(String[] args) {
        Forcast f = new Forcast();
        f.temp = 20;
        changeObj(f);
        System.out.println(f.temp);
    }

    private static void changeObj(Forcast f){
        f.temp = 35;
    }
}
