package com.classes.class029;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> fruits  = new HashMap<>();
        fruits.put("Kiwi",8);
        fruits.put("Appel",6);
        fruits.put("Orange",7);
        Map<String,Integer> vegetables  = new HashMap<>();
        vegetables.put("Tomato",11);
        vegetables.put("Cucumber",5);
        vegetables.put("Patato",1);
        Map<String,Integer> groceries  = new HashMap<>();
        groceries.putAll(vegetables);
        groceries.putAll(fruits);
        System.out.println(groceries);





    }
}
