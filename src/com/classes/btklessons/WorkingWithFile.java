package com.classes.btklessons;

import java.io.File;
import java.io.IOException;

public class WorkingWithFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\BtkDosyaOkumak\\students.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
