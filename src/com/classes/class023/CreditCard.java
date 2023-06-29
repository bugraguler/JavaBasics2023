package com.classes.class023;

public class CreditCard {
    double balance;
    double interest;

    void methodCalculateProfit(double balance, double interest) {
        System.out.println(balance * interest);
    }
}

class Visa extends CreditCard {

    @Override
    void methodCalculateProfit(double balance, double interest) {
        System.out.println(balance * interest + 1);
    }
}

class AX extends CreditCard {
    void methodCalculateProfit(double balance, double interest) {
        System.out.println(balance * interest + 2);
    }
}

class Task4 {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.methodCalculateProfit(4500, 0.56);
        Visa visa= new Visa();
        visa.methodCalculateProfit(4500,0.88);
        AX ax = new AX();
        ax.methodCalculateProfit(4500, 0.69);

    }
}