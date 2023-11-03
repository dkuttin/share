package com.java.repeating.oops;

public class AbstractAnonymousDemo {
    public static void main(String args[]){
        Age age = new Age() {
            @Override
            void ageDisplay() {
                System.out.println("age is "+ x);
            }
        };
        age.ageDisplay();
    }
}

abstract class Age{
    int x = 18;
    abstract void ageDisplay();
}
