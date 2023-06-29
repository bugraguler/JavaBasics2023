package com.classes.class030;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapsIntro {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 20.0);
        System.out.println(fruitMap);
        System.out.println(fruitMap.size());
        Set<String> keys = fruitMap.keySet();
        System.out.println(keys);
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().contains("e")) {
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
        System.out.println(fruitMap.size());


    }
}
