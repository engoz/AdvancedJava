package com.eng.behavior.read8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by enginoz on 4/10/16.
 */
public class Workingfile {

    public static void main(String[] args) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get("res/nashorn1.js"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        lines.add("print('foobar');");
        try {
            Files.write(Paths.get("res/nashorn1-modified.js"), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
