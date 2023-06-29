package com.classes.class024;

public abstract class Phone {
    abstract void makePhoneCall();
    abstract void facetimeCall();

}
class Iphone extends Phone{
        void makePhoneCall() {
            System.out.println("MakesPhoneCall");

    }

    void facetimeCall() {
        System.out.println("Can make facetime calls");
    }

}

class Task{
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.makePhoneCall();
        iphone.facetimeCall();
    }
}