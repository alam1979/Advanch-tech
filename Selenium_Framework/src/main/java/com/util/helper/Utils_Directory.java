package com.util.helper;



import java.io.File;

public class Utils_Directory {

    public static String getDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        for (String s : c.getName().split("\\.")) {
            dir = new File(dir, s);
        }

        if (dir.exists()) {
            System.out.println("Using data directory: " + dir.toString());
        } else {
            dir.mkdirs();
            System.out.println("Creating data directory: " + dir.toString());
        }

        return dir.toString() + File.separator;
    }
    
    public static String getSharedDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));
        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");
        
        return dir.toString() + File.separator;
    }
}
