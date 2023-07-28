package com.classes.btklessons;

import java.io.File;
import java.io.IOException;

public class WorkingWithFile2 {

    public static void main(String[] args) {
        createFile();
        getFileInfo();
    }
    public static void createFile() {
        File file = new File("C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\BtkDosyaOkumak\\deneme.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mavcut");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\BtkDosyaOkumak\\deneme.txt");
        if(file.exists()){
            System.out.println("Dosya adı"+file.getName());
            System.out.println("Dosya yolu"+file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canWrite());
        }
    }
}
