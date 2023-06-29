package com.classes.class030;

import java.util.HashSet;
import java.util.Set;

public class EntryB12 {
    String key;
    Double value;
    String name = "Sabit Olacak";

    public EntryB12(String key, Double value) {
        this.key = key;
        this.value = value;
    }

    String getKey() {
        return key;
    }

    Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "EntryB12{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}


class Test {

    public static void main(String[] args) {
        Set<EntryB12> entries = new HashSet<>();
        entries.add(new EntryB12("Apple", 12.0));
        entries.add(new EntryB12("Mango", 15.0));
        entries.add(new EntryB12("Banana", 18.0));
        entries.add(new EntryB12("Kiwi", 12.0));
        System.out.println(entries);
        for (EntryB12 b:entries
             ) {
            System.out.println(b);
            System.out.println(b.getKey());
            System.out.println(b.getValue());

        }

    }

}