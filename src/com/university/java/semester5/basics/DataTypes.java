package com.university.java.semester5.basics;

import com.university.java.semester5.members.Calculator;

public class DataTypes {

    int a =10;
    int b = 20;
    int[] nums = {3,1,4};


    public static void add(int a, int b){
        int add = a+b;
        DataTypes.sub(9,2);
        Math.max(3,5);
        Calculator calculator = new Calculator();
        //calculator.
   }

    public static void sub(int a, int b){
        int sub = a-b;
    }



    String name;
    String sem;
    String marks;


    public static void main(String[] args) {


        byte b = 100;

        short s = 2000;

        int i = 100000;

        long l = 100000000L;

        float floatVariable = 12.5f;

        double d = 15.678;

        char c = 'A';

        boolean flag = true;

//        System.out.println("byte b= "+b);
//
//        System.out.println(s);
//
//        System.out.println(i);
//
//        System.out.println(l);
//
//        System.out.println(f);
//
//        System.out.println(d);
//
//        System.out.println(c);
//
//        System.out.println(flag);

        DataTypes.add(4,6);


    }

}


