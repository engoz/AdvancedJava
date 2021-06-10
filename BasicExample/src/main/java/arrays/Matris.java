package arrays;

import java.util.Random;

public class Matris {

    static int[][] matris = new int[15][12];

    static {
        Random r = new Random();
        String kelime = "ABCDEFGHIJKLMNOPRSTUVYZ";
        int index = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 12; j++) {
                if (index == 79) {
                    matris[i][j] = 'A';
                } else if (index == 80) {
                    matris[i][j] = 'B';
                } else {
                    matris[i][j] = kelime.charAt(r.nextInt(kelime.length()));
                }
                index = index + 1;
            }
        }
    }

    public static void main(String[] args) {

        String bul = "AB";
        //Print Puzzele
        for (int i = 0; i < 15; i++) {
            System.out.println();
            for (int j = 0; j < 12; j++) {
                System.out.print((char) matris[i][j] + " ");
            }
        }
        System.out.println();
        int index = findKelime(bul);
        System.out.println(index);
    }

    private static int findKelime(String arananKelime) {
        int size = arananKelime.length();
        char[] temp = new char[size];
        int index = 0;
        int findIndex = -1;
        boolean first = false;
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 12; j++) {
                int x = findIndex((char) matris[i][j], arananKelime, temp, findIndex, index);
                if (x > -1) {
                    findIndex = x;
                } else {
                    findIndex = -1;
                    for (int s = 0; s < size; s++) {
                        if (temp[s] != 0)
                            temp[s] = 0;
                    }
                }

                if (temp[size - 1] != 0 && temp[size - 1] == arananKelime.charAt(size - 1)) {
                    return findIndex;
                }

                index = index + 1;
            }
        }

        return findIndex;
    }

    private static int findIndex(char matris, String arananKelime, char[] temp, int findIndex, int index) {
        for (int i = 0; i < arananKelime.length(); i++) {
            if (matris == arananKelime.charAt(i)) {
                if (i == 0 && temp[0] == 0) {
                    temp[i] = matris;
                    return index;
                } else if (i > 0 && temp[i - 1] != 0 && index == findIndex + 1) {
                    temp[i] = matris;
                    return findIndex;
                }
            }
        }

        return -1;
    }


}
