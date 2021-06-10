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
public class FindingFile {
    public static void main(String[] args) {
        Path start = Paths.get("");
        int maxDepth = 5;
        try {
            try (Stream<Path> stream = Files.find(start, maxDepth, (path, attr) ->
                    String.valueOf(path).endsWith(".js"))) {
                String joined = stream
                        .sorted()
                        .map(String::valueOf)
                        .collect(Collectors.joining("; "));
                System.out.println("Found: " + joined);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
