package com.classes.syntaxbasics;

public class ArrayTry3 {
    public static void main(String[] args) {
        int arr[]=new int[4];
        arr[0]=7;
        arr[1]=8;
        arr[2]=9;
        arr[3]=10;
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

    }
}
