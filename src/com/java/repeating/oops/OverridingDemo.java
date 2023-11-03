package com.java.repeating.oops;

public class OverridingDemo {
    public static void main(String args[]){
        parent p = new parent();
        p.display();
        parent c = new child();
        c.display();
    }
}

class parent {
    void display(){
        System.out.println("parent display");
    }
}

class child extends parent{
    void display(){
        System.out.println("Child display");
    }
}
