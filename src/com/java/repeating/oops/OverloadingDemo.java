package com.java.repeating.oops;

public class OverloadingDemo {
    public static void main (String arg[]){
        calculator cal = new calculator();
        System.out.println(cal.add(1,1,1));
        System.out.println(cal.add(1,1));
    }
}

class calculator {
    int add (int x, int y){
        return x+y;
    }
    int add (int x, int y, int z){
        return x+y+z;
    }
}
