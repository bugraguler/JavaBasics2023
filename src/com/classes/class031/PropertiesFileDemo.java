package com.classes.class031;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {
    public static void main(String[] args) throws IOException {

        //first step location the file that we want to read.
        String path="Files/Config.properties";

        //navigating to that location.
        FileInputStream fileInputStream = new FileInputStream(path);

        //this special class which knows how to read the .properties file.
        Properties properties = new Properties();

        //loading all the data from the file to properties object.
        properties.load(fileInputStream);

        System.out.println(properties.get("username"));

    }
}
