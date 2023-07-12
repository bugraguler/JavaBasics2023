package com.classes.btklessons;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[]{1, 2, 3};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Array limitation is not correct");
        }finally {
            System.out.println("ben her türlü yazılırım baba");
        }
    }

}
