package com.classes.class030;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        List<Integer> list = Arrays.asList(10, 20, 30);
        //list.add(40); not supported
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        list2.add(40);
        //in real life you will not use it a lot

    }
}
