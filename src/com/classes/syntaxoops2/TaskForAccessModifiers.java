package com.classes.syntaxoops2;

public class TaskForAccessModifiers {
    int method(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum = sum + a;
        }
        return sum;
    }

    public static void main(String[] args) {
        TaskForAccessModifiers taskForAccessModifiers = new TaskForAccessModifiers();
        int arr[]={12,35,22,14};
        System.out.println(taskForAccessModifiers.method(arr));
    }
}
