package com.eng;

public class SubStringEx {
    public static void main(String[] args) {
        String text = "Engin OZ merhaba";
        System.out.println(subS(text));
    }

    private static String subS(String text) {
        int indexOfBeginTag = text.indexOf("i");
        return text.substring(indexOfBeginTag);
    }
}
