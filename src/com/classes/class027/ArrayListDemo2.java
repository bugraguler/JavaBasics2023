package com.classes.class027;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String>sehirler= new ArrayList<>();
        sehirler.add("Ankara");
        sehirler.add("izmir");
        sehirler.add("Antalya");
        sehirler.add("Konya");
        System.out.println(sehirler);
        Collections.sort(sehirler);
        System.out.println(sehirler);
    }
}
