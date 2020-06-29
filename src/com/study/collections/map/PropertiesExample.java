package com.study.collections.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\mayur.p.ozardekar\\Documents\\IntelliJWorkspace\\HelloWorld\\src\\com\\study\\collections\\map\\test.prn.properties";
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        properties.load(fileInputStream);

        properties.setProperty("40", "Demo Java");
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        properties.store(fileOutputStream, "This is Demo File to save properties");
        System.out.println(properties);
    }
}
