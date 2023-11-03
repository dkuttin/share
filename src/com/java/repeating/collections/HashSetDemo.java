package com.java.repeating.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();
        hs.add("toyota");
        hs.add("honda");
        hs.add("BMW");
        System.out.println(hs);

        for (String k : hs){
            System.out.println(k);
        }
        //using iterator
        Iterator<String> it = hs.iterator();

        while (it.hasNext()){
            if(it.next().equalsIgnoreCase("BMW"));{
                it.remove();
            }
        }

        for (String k : hs){
            System.out.println(k);
        }


    }
}
