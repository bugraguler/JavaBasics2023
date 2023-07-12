package com.classes.class032;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\ExcelDemos\\tester.xlsx";

        //first we read the path
        FileInputStream fileInputStream = new FileInputStream(path);

        //it is a special class that reads the eexcel file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);

        //first we get sheet by their names
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        /*  System.out.println(sheet.getPhysicalNumberOfRows());
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row= sheet.getRow(i);
            System.out.println(row.getCell(0)+" "+row.getCell(1)); }    */

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell = row.getCell(j);
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
