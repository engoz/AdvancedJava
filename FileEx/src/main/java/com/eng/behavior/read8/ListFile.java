package com.eng.behavior.read8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by enginoz on 4/10/16.
 */
public class ListFile {
    public static void main(String[] args) {
        //listing file
        try (Stream<Path> stream = Files.list(Paths.get(""))) {
            String joined = stream
                    .map(String::valueOf)
                    .filter(path -> !path.startsWith(""))
                    .sorted()
                    .collect(Collectors.joining("; "));
            System.out.println("List: " + joined);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
