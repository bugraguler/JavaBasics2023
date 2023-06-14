package com.classes.syntaxoops;

public class BabyNameMakerStringMetods {
    void whatWillBeTheName(String fatherName,String motherName,Boolean isBabyBoy){
        String firstPart;
        String secondPart;
        if(isBabyBoy){
            firstPart=fatherName.substring(0,fatherName.length()/2);
            secondPart=motherName.substring(motherName.length()/2);
        }else{
            firstPart=motherName.substring(0,motherName.length()/2);
            secondPart=fatherName.substring(fatherName.length()/2);
        }
        System.out.println(firstPart+secondPart);
    }
}
