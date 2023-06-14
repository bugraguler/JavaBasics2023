package com.classes.syntaxbasics;

import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int sum=0;
        int sizeArray=scan.nextInt();
        int arr[]=new int[sizeArray];
        for(int i=0;i<sizeArray;i++){
            System.out.println("please enter the "+(i+1)+". number of array");
            arr[i]=scan.nextInt();
        }
        for(int a:arr){
            sum+=a;
        }
        System.out.println(sum);

    }
}
