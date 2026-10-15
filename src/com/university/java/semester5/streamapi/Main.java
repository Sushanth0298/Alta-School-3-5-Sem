package com.university.java.semester5.streamapi;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== FILTER =====");
        FilterDemo.demonstrate();

        System.out.println();

        System.out.println("===== MAP =====");
        MapDemo.demonstrate();

        System.out.println();

        System.out.println("===== MAX / MIN =====");
        MaxMinDemo.demonstrate();

        System.out.println();

        System.out.println("===== REDUCE =====");
        ReduceDemo.demonstrate();

        System.out.println();

        System.out.println("===== OPTIONAL =====");
        OptionalDemo.demonstrate();

        System.out.println();

        System.out.println("===== FOREACH =====");
        ForEachDemo.demonstrate();

        System.out.println();

        System.out.println("===== COMPLETE PIPELINE =====");
        StreamPipelineDemo.demonstrate();
    }
}
