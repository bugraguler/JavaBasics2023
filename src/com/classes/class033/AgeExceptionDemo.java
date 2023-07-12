package com.classes.class033;

public class AgeExceptionDemo {
    private static void validateAge(int age) throws AgeLessThanZeroException {
        if(age<0){
            throw new AgeLessThanZeroException ("oh nooo",new RuntimeException());
        }else{
            System.out.println("You entered your age correctly");
        }
    }

    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(-5);
    }
}
