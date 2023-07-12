package com.classes.javainterviewprep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task217Repl {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(countDuplicates(Arrays.asList(12,53,26,36,12,35,26,36)));

    }

    static int countDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : numbers) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        int duplicateCount = 0;
        for (int count : countMap.values()){
            if(count>1){
                duplicateCount++;
            }
        }
        return duplicateCount;
    }
}
