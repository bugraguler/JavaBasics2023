package com.classes.class025;

public interface Human {
    int legs = 4;

    void walk();

    static void printLegs() {
        System.out.println("legss");
    }
}
interface  LivingBeing{
    int age = 4;
    void dodi();
    static void nino(){
        System.out.println("dnemesk");
    }
}
class Maha implements Human,LivingBeing{

    public void walk() {
        System.out.println("implemented method");
    }
    public void dodi() {
        System.out.println("multiple inheritance");
    }

    public static void main(String[] args) {
        Maha maha= new Maha();
        maha.walk();
        Human.printLegs();
        maha.dodi();
        LivingBeing.nino();

    }


}