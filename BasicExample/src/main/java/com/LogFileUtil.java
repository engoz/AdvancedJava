package com;

import java.io.File;

public class LogFileUtil {

    private static final String OS = System.getProperty("os.name").toLowerCase();
    private static final String SEPARATOR = System.getProperty("file.separator");

    public static void main(String[] args) {
        System.out.println(getLogFileName(null));
    }

    public static String getLogFileName(String fileName) {
        String tmpDir = getTempDir();
        if (fileName == null) {
            return tmpDir + SEPARATOR + "tradesurf.log";

        } else {
            return tmpDir + SEPARATOR + fileName;
        }
    }

    public static String getTMULogFileName(String fileName) {
        return getLogFileName(fileName == null ? "tradesurf_tmu.log" : fileName);
    }

    private static String getTempDir() {
        String tmpDir;
        if (OS.contains("mac")) {
            tmpDir = System.getProperty("user.home") + "/Library/Caches/" + "com.servicium.TradeSurf";
            File directory = new File(tmpDir);
            if (!directory.exists()) {
                directory.mkdirs();
            }
        } else {
            tmpDir = System.getProperty("java.io.tmpdir");
        }
        return tmpDir;
    }



    public static String getChartTemplateFileName(String name){
        File directory = new File(getChartTemplateDirectory());
        if(!directory.exists()){
            directory.mkdirs();
        }
        return getChartTemplateDirectory() + SEPARATOR + name + ".template";
    }

    public static String getChartTemplateDirectory(){
        String tmpDir = getTempDir();
        String chartTemplateDirectory =  tmpDir + SEPARATOR + "chartTemplate";
        return chartTemplateDirectory;
    }

    public static String getChartWorkspaceFileName(String name){
        File directory = new File(getChartTemplateDirectory());
        if(!directory.exists()){
            directory.mkdirs();
        }
        return getChartTemplateDirectory() + SEPARATOR + name + ".workspace";
    }
}
