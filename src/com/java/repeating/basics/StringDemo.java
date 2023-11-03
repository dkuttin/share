package com.java.repeating.basics;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringDemo {
    String someName = "John";
    public static void main (String arg[]){
        StringDemo testName = new StringDemo();
        System.out.println(testName.someName);
        String txt = ("Hello world");
        System.out.println(txt);
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("world"));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        //String buffer
        StringBuffer bf = new StringBuffer("Hello ");
        System.out.println(bf);
        System.out.println(bf.indexOf("World!"));///getting -1 since it doesn't exist

        String s1 = "geeks";
        s1.concat("forget");
        System.out.println(s1); //overwitten

        StringBuffer bf2 = new StringBuffer("geeks");
        bf2.append("forget");
        System.out.println(bf2);

        StringBuilder sb = new StringBuilder("geeks");
        sb.append("forget");
        System.out.println(sb);

        // String is immutable whereas StringBuffer and
        // StringBuilder are mutable classes.
        // StringBuffer is thread-safe and synchronized whereas StringBuilder is not.
        // That's why StringBuilder is faster than StringBuffer.


    }
}
