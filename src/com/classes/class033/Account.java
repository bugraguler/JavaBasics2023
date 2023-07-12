package com.classes.class033;

public class Account {
    double balance;
    public void setBalance(double balance)  {
        throw new InsufficientBalance("cant set negative balance");

    }
}
