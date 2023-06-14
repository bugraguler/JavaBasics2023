package com.classes.syntaxoops;

public class UsernameAndPassword {
    void checkUsernamePassword(String username, String password) {
        String usernameScCheck = username.replaceAll("[^a-zA-Z0-9_?!/]", "*");
        if (username.isEmpty()) {
            System.out.println("Username can not be null!");
        } else if (username.contains(" ")) {
            System.out.println("It is not allowed space in a username or password!");
        } else if (usernameScCheck.contains("*")) {
            System.out.println("Username has to contain only letters and numbers!");
        } else if (username.length() < 8 || username.length() > 12) {
            System.out.println("Username can not have more than 8 and less than 12 character");
        } else {

            String passwordScCheck = username.replaceAll("[^a-zA-Z0-9_?!/]", "*");
            if (username.isEmpty()) {
                System.out.println("Password can not be null!");
            } else if (username.contains(" ")) {
                System.out.println("It is not allowed space in a username or password!");
            } else if (passwordScCheck.contains("*")) {
                System.out.println("Password has to contain only letters and numbers!");
            } else if (password.length() < 8 || password.length() > 15) {
                System.out.println("Password can not have more than 8 and less than 12 character");
            } else if (password.contains(username)) {
                System.out.println("Password can not contain the username");
            } else {
                System.out.println("You have been created your Username and Password succesfully");
            }
        }

    }
}

 /* Pattern p =Pattern.compile("[^a-z0-9 ]",Pattern.CASE_INSENSITIVE);
     Matcher m=p.matcher("I am a string");
     Boolean b=m.find();
     if (b){
         System.out.println("There is a special character in your username please do not use special character");
     } */