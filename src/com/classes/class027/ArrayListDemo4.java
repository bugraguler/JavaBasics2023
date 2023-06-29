package com.classes.class027;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("Bugra","Guler",2530));
        customers.add(new Customer("Mami","Alkan",2207));
        customers.add(new Customer("Omer","Yegen",2330));
        customers.add(new Customer("Samet","Acar",2210));
        System.out.println(customers.size());

        for (Customer customer:customers
             ) {
            System.out.println(customer.firstName);
        }


    }

}