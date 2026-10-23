package com.university.java.semester5.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

class Theatre {
    String name;
    Location location;
    List<Screen> screens = new ArrayList<>();

    Theatre(String name, Location location) {
        this.name = name;
        this.location = location;
    }
}
