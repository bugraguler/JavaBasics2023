package com.classes.syntaxbasics;

public class Array2D {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {4, 6, 8, 9}, {0, 5, 6}};
        //System.out.println(array.length);
        int sum = 0;
        for (int arr[] : array) {
            for (int a : arr) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
