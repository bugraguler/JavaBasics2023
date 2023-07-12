package com.classes.class032;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
//we do it to create an excel file in pointed place
public class ExcelDemo4 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\ExcelDemos\\excelDeneme.xlsx";
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet=xssfWorkbook.createSheet("Sheet2");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Deneme ben");
        xssfWorkbook.write(fileOutputStream);//çok önemli bu satır ile yazıyoruz üretilen veriyi
    }
}
