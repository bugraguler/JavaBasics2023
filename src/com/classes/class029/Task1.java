package com.classes.class029;

import java.util.ArrayList;
import java.util.Iterator;

/*Create a class Insurance that will have an  attribute as insuranceName and unimplemented
behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has
petType attribute. Create 3 objects of the sub classes and store them in ArrayList. Using for
loop/advanced for loop/ iterator access all methods of the class.
 */
public class Task1 {
    public static void main(String[] args) {

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new Car("bmw", "a sigorta"));
        insurances.add(new Pet("horse", "b sigorta"));
        insurances.add(new Health("c sigorta"));
        for (Insurance i : insurances) {
            i.getQuote();
            i.cancelInsurance();

        }
        System.out.println("*********************************************");
        Iterator<Insurance>iterator=insurances.iterator();
        while(iterator.hasNext()){
            Insurance i= iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }
    }


}


abstract class Insurance {
    String insuranceName;

    abstract void getQuote();

    abstract void cancelInsurance();
}

class Car extends Insurance {
    String carModel;

    public Car(String carModel, String insuranceName) {
        this.carModel = carModel;
        super.insuranceName = insuranceName;
    }

    @Override
    void getQuote() {
        System.out.println(carModel + " " + insuranceName + " " + "Car getQuote");
    }

    @Override
    void cancelInsurance() {
        System.out.println(carModel + " " + insuranceName + " " + "Car Insurance");
    }
}

class Pet extends Insurance {
    String petType;

    public Pet(String petType, String insuranceName) {
        this.petType = petType;
        super.insuranceName = insuranceName;
    }

    @Override
    void getQuote() {
        System.out.println(petType + " " + insuranceName + " " + "Pet getQuote");
    }

    @Override
    void cancelInsurance() {
        System.out.println(petType + " " + insuranceName + " " + "Pet Insurance");
    }
}

class Health extends Insurance {

    public Health(String insuranceName) {
        super.insuranceName = insuranceName;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName + " " + "Health getQuote");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName + " " + "Health Insurance");
    }
}