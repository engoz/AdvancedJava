package com.eng.behavior.read8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by enginoz on 4/10/16.
 */
public class TestReadFile1 {

    public static void main(String args[]) {

        // String fileName = "ABBREV.txt";
        String fileName = "lines.txt";


        //read file into stream, try-with-resources
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
