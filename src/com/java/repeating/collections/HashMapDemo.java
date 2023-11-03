package com.java.repeating.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, String> CapitalCity = new HashMap<>();
        CapitalCity.put("England", "London");
        CapitalCity.put("Germany", "Berlin");
        CapitalCity.put("Norway", "Oslo");
        System.out.println(CapitalCity);

        for(String k: CapitalCity.keySet()){
            System.out.println(k);
        }
        System.out.println("+++++++");
        for(String i: CapitalCity.values()){
            System.out.println(i);
        }
    }
}
