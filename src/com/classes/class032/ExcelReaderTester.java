package com.classes.class032;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTester {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\pcbel\\OneDrive\\Masaüstü\\SYNTAX\\ExcelDemos\\Book2.xlsx";
        List<Map<String,String>> excelData=ExcelReader.getData(path,"Sayfa1");
        System.out.println(excelData.get(1).get("Ad"));
        System.out.println(excelData.get(5).get("Soyad"));
    }
}
