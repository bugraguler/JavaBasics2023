package com.classes.class033;

import java.util.InputMismatchException;
import java.util.Scanner;
//InputMismatchException
public class ExceptionTask1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(scanner.nextInt());
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter a number");
        }
    }
}
