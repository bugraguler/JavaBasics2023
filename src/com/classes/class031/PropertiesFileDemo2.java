package com.classes.class031;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo2 {
    public static void main(String[] args) throws IOException {
        String path="Files/Config.properties";
        //override yapmasın diye önce var olan veriyi okumalıyız
        FileInputStream fileInputStream= new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fileInputStream);
        properties.put("url","www.google.com");
        //sonra üzerine yenisini yazmalıyız
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"added new things");

    }
}
