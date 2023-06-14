package com.classes.syntaxoops2;

public class HorseConstructor {
        private String name;
        private int age;
        private double weight;

        HorseConstructor(String horseName,int horseAge,double horseWeight){
            name=horseName;
            age=horseAge;
            weight=horseWeight;
        }

        void printHorseName(){
            System.out.println("Name "+name);
        }



    
}
