package com.classes.class031;

import java.util.ArrayList;
import java.util.HashMap;

public class MapToMap {
    public static void main(String[] args) {
        HashMap<String,Double>fruit= new HashMap<>();
        fruit.put("Apple",10.0);
        fruit.put("Orange",15.0);

        HashMap<String,Double>vegetables= new HashMap<>();
        fruit.put("Onion",10.0);
        fruit.put("Carrot",15.0);

        ArrayList<HashMap<String,Double>>list= new ArrayList<>();
        list.add(fruit);
        list.add(vegetables);
        System.out.println(list);




    }
}
