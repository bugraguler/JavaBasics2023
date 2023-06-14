package com.classes.syntaxoops;

public class PrimeNumber {
    boolean isPrime(int num) {
        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        } else {
            isPrime = false;
        }
        return isPrime;
    }

}

