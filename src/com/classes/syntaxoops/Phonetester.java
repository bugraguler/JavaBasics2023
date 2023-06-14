package com.classes.syntaxoops;

public class Phonetester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.modelName="13 Pro Max";
        iphone.screen=6.7;
        iphone.brand="ios";
        iphone.price=999;
        iphone.total();
    }
}
