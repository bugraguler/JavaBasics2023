package com.classes.syntaxbasics;

import java.util.Scanner;

public class UserInputScannerClass {
    public static void main(String[] args) {
        System.out.println("write a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("the number is " + number);
        char x=scan.next().charAt(1);

        
    }
}
