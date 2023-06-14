package com.classes.syntaxbasics;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        String dayName;


        switch (day) {
            case 1:
                dayName = "a";
                break;
            case 2:
                dayName = "b";
                break;
            case 3:
                dayName = "c";
                break;
            default:
                dayName = "invalid";

        }
        System.out.println(dayName);

    }
}

