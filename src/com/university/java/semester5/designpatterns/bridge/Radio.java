package com.university.java.semester5.designpatterns.bridge;

public class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio turned ON");
    }

    public void turnOff() {
        System.out.println("Radio turned OFF");
    }

    public void setVolume(int volume) {
        System.out.println("Radio volume set to " + volume);
    }
}