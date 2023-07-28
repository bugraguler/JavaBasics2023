package com.classes.btklessons;

import java.io.*;
import java.util.Scanner;

public class DosyaOKuma {

    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }

    public static void readFile() {
        File file = new File("C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\BtkDosyaOkumak\\deneme.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\BtkDosyaOkumak\\deneme.txt",true));
            //append true ekledik üzerine ilave yazdı
            writer.newLine();
            writer.write("Aji tasyon");
            System.out.println("Dosya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
