package com.java.repeating.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<String> cars = new LinkedList<>();
            cars.add("toyota");
            cars.add("ford");
            cars.add("honda");
        System.out.println("linked list output is "+ cars);
        Collections.sort(cars);
        System.out.println("linked list output is "+ cars);


        }
    }
