package com.java.repeating.oops;

public class ClassDemo {
    public static void main(String arg[]){
        ClassDemo cd1 = new ClassDemo();
        cd1.insert_studentInfo("deepak", "kuttin", 25);
        cd1.displyStudentInfo();
    }

    private int age;
    private String firstName;
    private String lastName;
    void insert_studentInfo(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void displyStudentInfo(){
        System.out.println("First Name "+ firstName+ "\n"+ "Last Name "+ lastName+ "\n"+"AGE" +age);
    }
}
