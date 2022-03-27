package system;

import java.io.IOException;
import java.util.Map;

public class SystemEnv {

    public static void main(String[] args) {
        String log_dir = System.getProperty("log_dir", "/tmp/log");
        System.out.println(log_dir);

        //java runtime
        //java -jar jarName -Dlog_dir=/tmp/log
        //java -jar app -Dfoo="bar"

        System.getenv().forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        String log_dir2 = System.getenv("log_dir");

        ProcessBuilder pb = new ProcessBuilder(args);
        Map<String, String> env = pb.environment();
        env.put("log_dir", "/tmp/log");
        try {
            Process process = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
