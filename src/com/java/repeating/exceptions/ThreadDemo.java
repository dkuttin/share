package com.java.repeating.exceptions;

public class ThreadDemo extends Thread{
    public void run(){
        System.out.println("running the run method");
    }

    public static void main(String args[]){
        ThreadDemo td = new ThreadDemo();
            td.start();
        System.out.println("this code is outside of run method");
    }
}

