package com.classes.class032;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemo6 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\ExcelDemos\\Book2.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sayfa1");

        List<Map<String, String>> excelData = new ArrayList<>();

        Row headerRow = sheet.getRow(0);
        for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {
            Row row = sheet.getRow(j);
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap();
            for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
                linkedHashMap.put(headerRow.getCell(i).toString(), row.getCell(i).toString());
            }
            excelData.add(linkedHashMap);

        }
        System.out.println(excelData);

    }
}
