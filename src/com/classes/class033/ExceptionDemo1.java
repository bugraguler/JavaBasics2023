package com.classes.class033;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try{
            //System.out.println(10/0);
            String name=null;
            name.length();
            int []arr= new int[-4];
            String strArr[]=new String[2];
            strArr[5]="Issues";
        }catch(ArithmeticException arithmeticException){
            System.out.println("1");
        }catch(NullPointerException nullPointerException){
            System.out.println("2");
        }catch(NegativeArraySizeException negativeArraySizeException){
            System.out.println("3");
        }catch(IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("4");
        }catch(Exception exception){
            System.out.println("5");

        }
    }
}


