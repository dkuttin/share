package com.java.repeating.oops;
import java.util.HashMap;

public class TestPerson {
    //private static Object HashMap;

    public static void main(String args[]){
        person p1 = new person("Sri", "ni");
        person p2 = new person("Deepak", "Kuttin");
        System.out.println(p1.getLastName());
        System.out.println(p2.getLastName());

        HashMap<String, person> hashMapdemo = new HashMap<>();
        hashMapdemo.put(p1.getLastName(), p1);
        hashMapdemo.put(p2.getLastName(),p2);

        for (String key:hashMapdemo.keySet()) {
            person person = hashMapdemo.get(key);
            System.out.println(person.getFirstName());
        }

    }
}

class person {
    private String firstName;
    private String lastName;

    public person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
