package com.classes.class033;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallayDemo {
    public static void main(String[] args)  {
        FileInputStream fileInputStream=null;
        try{
        String path = "C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\ExcelDemos\\Book2.xlsx";
        fileInputStream= new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.createSheet("Deneme");}
        catch (FileNotFoundException fileNotFoundException){
            System.out.println("The file is not present ");
        }catch(IOException ioException){
            System.out.println("something went wrong");
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("error while closing the file");
            }
        }
        System.out.println("7");

    }
}
