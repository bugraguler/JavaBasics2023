package com.classes.class028;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int num=10;
        Integer num2 = new Integer(num);//boxing

        int num3=num2.intValue();//unboxing


        Integer num5 = 10;//autoBoxing
        int num6 = num5;//autounBoxing


    }

}
