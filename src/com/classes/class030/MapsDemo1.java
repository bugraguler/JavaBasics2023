package com.classes.class030;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo1 {
    public static void main(String[] args) {
        HashMap<String, Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 105.2);
        fruitMap.put("Orange", 16.5);
        fruitMap.put("Mango", 20.0);
        System.out.println(fruitMap);
        System.out.println(fruitMap.size());
        Collection<Double> values = fruitMap.values();
        System.out.println(values);
        Iterator<Double>iterator= values.iterator();
        while (iterator.hasNext()){
            if(iterator.next()>=20){
                iterator.remove();
            }
        }
        System.out.println(values);
        System.out.println(fruitMap);
    }
}
