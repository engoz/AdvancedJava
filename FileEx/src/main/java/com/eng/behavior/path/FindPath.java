package com.eng.behavior.path;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by enginoz on 4/10/16.
 */
public class FindPath {

    public static void main(String[] args) {
        //Bir
        URL location = FindPath.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());

        //iki
        File classpathRoot = new File(FindPath.class.getResource("").getPath());
        File[] csvFiles = classpathRoot.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".csv");
            }
        });

        System.out.println(classpathRoot);

        //uc
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);

        //dort
        File currentDirectory = new File(new File("").getAbsolutePath());
        try {
            System.out.println(currentDirectory.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(currentDirectory.getAbsolutePath());

        //bes
        System.out.println(FindPath.class.getClassLoader().getResource("").getPath());

        //alti
        String internalPath = FindPath.class.getName().replace("", File.separator);
        String externalPath = System.getProperty("user.dir") + File.separator + "src";
        String workDir = externalPath + File.separator + internalPath.substring(0, internalPath.lastIndexOf(File.separator));

        //yedi
        Path workingDirectory = Paths.get("").toAbsolutePath();
        System.out.println(workingDirectory);

    }
}
