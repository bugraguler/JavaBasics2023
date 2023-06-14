package com.classes.syntaxoops2;

public class UserClass {
    String  name;
    int mobileNumber;

    UserClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}

class UserInfo extends UserClass{
    String userAdress;

    UserInfo(String name, int mobileNumber, String userAdress){
        super(name,mobileNumber);
        this.userAdress=userAdress;

    }
   void userDetails(){
        System.out.println(name+" "+mobileNumber+userAdress);
    }

    public static void main(String[] args) {
        UserInfo userinfo= new UserInfo("ali",45," celestijnenlaan");
        userinfo.userDetails();


    }
}
