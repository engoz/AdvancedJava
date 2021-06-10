package com.eng.behavior.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {

    public static void main(String[] args) {

        try {
            for (int i = 1; i < 10; i++) {
                Files.copy(Paths.get("C:\\Users\\engin.oz\\Videos\\0.mp4"), Paths.get("C:\\Users\\engin.oz\\Videos\\" + i + ".mp4"),
                        StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Copy " + i);
                Thread.sleep(1);
            }

            for (int i = 1; i < 10; i++) {
                Path path = Paths.get("C:\\Users\\engin.oz\\Videos\\" + i + ".mp4");
                File file = path.toFile();
                if (file.exists()) {
                    Files.delete(path);
                    System.out.println("Deleted " + file.getName());
                }
                Thread.sleep(1);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
