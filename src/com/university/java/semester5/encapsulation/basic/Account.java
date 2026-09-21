package com.university.java.semester5.encapsulation.basic;

public class Account {

    private double bal;

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {

        if(bal > 0){
            this.bal = bal;
        }else{
            System.out.println("Invalid amount");
        }

    }

}
