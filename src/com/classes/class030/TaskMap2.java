package com.classes.class030;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
● Print all keys and values from a country map using for each loop and iterator.
● Print all values from a country map using for each loop and iterator.
 */
public class TaskMap2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Turkey", "Ankara");
        countries.put("Belgium", "Brussels");
        countries.put("ABD", "Washington");
        countries.put("Spain", "Madrid");
        System.out.println(countries);
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        Iterator<Map.Entry<String,String>> iterator=countries.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String>entry=iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
//