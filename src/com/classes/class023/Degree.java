package com.classes.class023;

class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

    class Bachelors extends Degree {

    }

    class Masters extends Degree {
        void getPrerequisite() {
            System.out.println("This is master overrided message");
        }
    }

    class Task {

        public static void main(String[] args) {
            Masters masters = new Masters();
            masters.getPrerequisite();
            Bachelors bachelors = new Bachelors();
            bachelors.getPrerequisite();
        }
    }