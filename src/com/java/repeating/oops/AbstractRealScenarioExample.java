package com.java.repeating.oops;

public class AbstractRealScenarioExample {
    public static void main(String args[]){
        bank chase = new chase();
        bank boa = new boa();
        System.out.println("Chase bank interest rate is " + chase.getInterestRate()+"%");
        System.out.println("boa bank interest rate is "+ boa.getInterestRate()+"%");
    }
}

abstract class bank{
    abstract int getInterestRate();
}

class chase extends bank{
    int getInterestRate(){
        return 7;
    }
}

class boa extends bank{
    int getInterestRate(){
        return 8;
    }
}
