package com.classes.syntaxbasics;

import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args) {
        int time=15;
        while(time<20){
            System.out.println(time);
            time++;
        }
        System.out.println(time);
        do{
            System.out.println("do while");
            time++;
        }while(time<23);
        for(int i=0;i<=7;i++){
            System.out.print(i);
        }
    }

}
