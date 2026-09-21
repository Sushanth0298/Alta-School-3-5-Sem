package com.university.java.semester3and5.members;


public class StaticBlockDemo {

    static{

        System.out.println("Static Block Executed");

    }

    public static void main(String[] args){

        System.out.println("Main Method");
        Calculator c = new Calculator();



    }

}
