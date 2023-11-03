package com.java.repeating.exceptions;

public class TestThread {
    public static void main(String args[]){
        MyTestThead m1 = new MyTestThead("Twitter");
        m1. start();
        MyTestThead m2 = new MyTestThead("Facebook");
        m2.start();
        MyTestThead m3 = new MyTestThead("something");
        m3.start();
    }
}

class MyTestThead extends Thread{
    public MyTestThead(String myThread) {
        super(myThread);
    }

    public void run(){
        for (int counter = 0; counter <= 5; counter ++){
            System.out.println("Loop counter "+ counter + getName()+ " ID "+ getId() + " State " + getState());
            try{
                sleep((int) (Math.random() * 2000));
            }
            catch (InterruptedException ce){
                ce.printStackTrace();
            }
        }
    }

}