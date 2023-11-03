package com.java.repeating.collections;

import java.util.*;

public class ListSetDemo {
    public static void main(String args[]){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(3);
        System.out.println("list output is "+l);

        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(5);
        s.add(3);
        System.out.println("set output is "+ s);

    }
}
