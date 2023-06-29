package com.classes.class027;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Onion");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries);

        ArrayList<String>itemsToBeRemoved= new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");
        //itemsToBeRemoved.add("buyok");
        System.out.println(groceries.containsAll(itemsToBeRemoved));

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);


    }
}
