package com.java.repeating.oops;

public class StaticNestedClassDemo {
    public static void main(String args[]){
        outerClassNew.innerClass inner = new outerClassNew.innerClass();
        inner.display();
    }
}

class outerClassNew{
    static int x = 1;
    private static int static_x = 2;
    int y = 3;
    static class innerClass{
        void display (){
            System.out.println("outer x "+x);
            System.out.println("outer static x "+static_x);
            //System.out.println("outer y "+y); //cannot access non static content in the inner class
        }
    }
}
