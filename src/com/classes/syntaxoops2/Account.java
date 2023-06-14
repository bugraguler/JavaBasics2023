package com.classes.syntaxoops2;

public class Account {
    private String userName;
    private String password;
    public String accountNumber;
    private double balance;

    private void printUserName(){

        System.out.println(userName);
    }
    protected void printPassword(){
        System.out.println(password);
    }
    void printBalance(){
        System.out.println(balance);
    }
    public void printAccountNumber(){

        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        Account account= new Account();
        account.userName="Osimo";
        account.password="13426Bg";
        account.balance=-1500;
        account.accountNumber="13642";
        account.printUserName();
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }
}
