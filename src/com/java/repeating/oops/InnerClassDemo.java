package com.java.repeating.oops;

import org.w3c.dom.ls.LSOutput;

public class InnerClassDemo {
    public static void main(String arg[]){
        outerClass oc = new outerClass();
                oc.outerClassMethod();
                outerClass.innerClass ic = oc.new innerClass();
                ic.innerClassMethod();

    }
}

class outerClass {
    int x = 5;
    void outerClassMethod(){
        System.out.println("outerclassmethod"+x);
    }
    class innerClass {
        int y = 10;
        void innerClassMethod(){
            System.out.println("InnerClass method"+y);
        }
    }
}
