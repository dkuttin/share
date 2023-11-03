package com.java.repeating.oops;

public class InheritanceDemo {
    public static void main(String arg[]) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        puppy p = new puppy();
        p.eat();
        p.bark();
        p.crying();
    }
}
   class Animal {
        void eat (){
            System.out.println("Eating...");
        }
    }

    class Dog extends Animal {
        void bark() {
            System.out.println("barking...");
        }
    }

    class puppy extends Dog {
        void crying(){
            System.out.println("crying...");
        }
    }
