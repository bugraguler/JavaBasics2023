package com.classes.class032;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDemo1 {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\ExcelDemos\\tester.xlsx";
        //first we read the path
        FileInputStream fileInputStream= new FileInputStream(path);

        //it is a special class that reads the eexcel file
        XSSFWorkbook xssfWorkbook= new XSSFWorkbook(fileInputStream);

        //first we get sheet by their names
        Sheet sheet= xssfWorkbook.getSheet("Sheet1");

        //we read data from row
        Row row= sheet.getRow(0);

        //we read data from column
        Cell cell=row.getCell(0);
        
        System.out.println(cell);




    }
}
