package com.eng.behavior.Array;

/**
 * Created by servicium on 09.07.2016.
 */
public class SearchArray {

    public static void main(String[] args) {
        char[][] letters = {{'A', 'B', 'C', 'D', 'E', 'f', 'g'}, {'T', 'h', 'j', 'k', 'i', 'o', 'p'}};
        char searchLetter = 'g';
        search:
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                if (letters[i][j] == searchLetter) {
                    System.out.println("Found at index : " + i + "," + j);
                    break search;
                }
            }
        }
        System.out.println("Search Complated");
    }
}
