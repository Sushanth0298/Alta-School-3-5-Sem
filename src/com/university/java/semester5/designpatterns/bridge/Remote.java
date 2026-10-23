package com.university.java.semester5.designpatterns.bridge;

public class Remote {
    protected Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }
}
