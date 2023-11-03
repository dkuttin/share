package com.java.repeating.basics;
import java.util.Arrays;

public class ArraysDemo {
    public static void main (String arg []) {
        int[] arr;
        arr = new int[3]; //allocating memory

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("index of " + arr[i]);
        }


        // Print all the array elements using for-each
        System.out.println("Print using foreach loop");
        for (int k: arr) {
            System.out.println("Index of " + k);
        }
    }

}
