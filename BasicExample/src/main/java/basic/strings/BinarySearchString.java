package basic.strings;

/**
 * Created by servicium on 20.07.2016.
 */
public class BinarySearchString {

    final static int MaxNames = 8;

    public static void main(String[] args) {
        String name[] = {"Charles, Kandice", "Graham, Ariel",
                "Graham, Ashleigh", "Greaves, Sherrelle", "Perrott, Chloe",
                "Reyes, Aaliyah", "Reyes, Ayanna", "Seecharan, Anella"};

        System.out.println("Name length : " + name.length);
        int n = binarySearch("Charles, Kandice", name, 0, MaxNames - 1);
        System.out.printf("%d\n", n);  //will print 0, location of Charles, Kandice
        n = binarySearch("Reyes, Ayanna", name, 0, MaxNames - 1);
        System.out.printf("%d\n", n); //will print 6, location of Reyes, Ayanna
        n = binarySearch("Perrott, Chloe", name, 0, MaxNames - 1);
        System.out.printf("%d\n", n); //will print 4, location of Perrott, Chloe
        n = binarySearch("Graham, Ariel", name, 4, MaxNames - 1);
        System.out.printf("%d\n", n); //will print -1, since Graham, Ariel is not in locations 4 to 7
        n = binarySearch("Cato, Brittney", name, 0, MaxNames - 1);
        System.out.printf("%d\n", n); //will print -1 since Cato, Brittney is not in the list
    } //end main

    private static int binarySearch(String key, String[] list, int lo, int hi) {
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int cmp = key.compareTo(list[mid]);
            if (cmp == 0) return mid;
            if (cmp < 0)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }


}
