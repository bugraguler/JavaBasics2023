package com.classes.class031;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
//bu kod ile yeni trump.properties isminde dosya oluşturuldu
public class PropertiesFileDemo1 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\trump.properties";
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        Properties properties = new Properties();
        properties.put("IsCrazy","false");
        properties.put("isRich","true");
        properties.store(fileOutputStream,"Added some new fields");



    }
}
