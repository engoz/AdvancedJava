package com.eng;

import java.io.IOException;
import java.util.Map;

public class SystemEnv {
    public static void main(String[] args) {
        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        String log_dir = System.getenv("log_dir");
        System.out.println("Log Dir : " + log_dir);

        /*
        ProcessBuilder pb = new ProcessBuilder("D");
        Map<String, String> env = pb.environment();
        env.put("log_dir", "/tmp/log");
        try {
            Process process = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        System.out.println("Log Dir : " + log_dir);
    }
}
