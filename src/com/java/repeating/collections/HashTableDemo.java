package com.java.repeating.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableDemo {
    public static void main (String args[]){
        Hashtable <String, Integer> hs = new Hashtable<>();
            hs.put("a", 1);
            hs.put("b",2);
            hs.put("c",3);
        System.out.println(hs);
        Iterator it = hs.keySet().iterator();
        while (it.hasNext()){
            System.out.println("Iterator out put " + hs.get(it.next()));
        }

        for (String key:hs.keySet()){
            System.out.println(key);
        }
        System.out.println("++++++++++++");
        for (Integer key:hs.values()){
            System.out.println(key);
        }

    }
}
