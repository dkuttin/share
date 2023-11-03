package com.java.repeating.exceptions;

public class ExceptionDemo {
    public static void main (String args[]) throws Exception{
        int[] numbers = {1,2,3};
        for (int k: numbers){
            System.out.println(k);
        }
        System.out.println(numbers[5]);
    }
}
