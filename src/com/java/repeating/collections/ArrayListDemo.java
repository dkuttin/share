package com.java.repeating.collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(50);
        al.add(4);
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
        System.out.println("+++++++");
        Collections.sort(al);
        for (int k:al){
            System.out.println(k);
        }
        System.out.println("+++++++");

        ArrayList<String> cars = new ArrayList<>();
            cars.add("honda");
            cars.add("toyota");
            cars.add("BMW");
            Collections.sort(cars);
        for(String k: cars){
            System.out.println(k);
        }
        }
    }
