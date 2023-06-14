package com.classes.syntaxoops;

public class MarketDiscount {
    double newPrice (boolean isSaleOn,double price,double discount){
        if(isSaleOn==true){
            return price-(price*discount);
        }else{
        return price;
        }
    }

    public static void main(String[] args) {
        MarketDiscount marketDiscount=new MarketDiscount();
        double result=marketDiscount.newPrice(false,989,0.25);
        System.out.println(result);
    }

}
