package com.classes.class026;

import java.util.ArrayList;

public class ArrayListsDemo {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(3.0);
        numbers.add(3.0);
        numbers.add(4.0);
        System.out.println(numbers.get(2));
        System.out.println(numbers);
        numbers.remove(3.0);
        System.out.println(numbers);
        numbers.remove(3.0);
        System.out.println(numbers);
        numbers.remove(3.0);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.remove(3.0);
        System.out.println(numbers);
        ArrayList<Boolean>flags= new ArrayList<>();
        flags.add(true);
        flags.add(false);
        System.out.println(flags);
        System.out.println(flags.contains(false));




    }
}
