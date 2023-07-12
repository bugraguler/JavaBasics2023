package com.classes.class033;

public class DoSomething {
    void DoSomething(int a ,int b){
        Calculator calculator= new Calculator();
        calculator.dotheMath(a,b);
    }

    public static void main(String[] args) {
            DoSomething doSomething= new DoSomething();
            doSomething.DoSomething(5,1);
    }
}
