package com.classes.class031;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToMap {
    public static void main(String[] args) {
        ArrayList<String>vegetables= new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");

        ArrayList<String>fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");

        Map<String,ArrayList<String>> healthyFood= new HashMap<>();
        healthyFood.put("vegi",vegetables);
        healthyFood.put("frui",fruit);

        System.out.println(healthyFood);

    }
}
