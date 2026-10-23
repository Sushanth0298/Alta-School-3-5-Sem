package com.university.java.semester5.designpatterns.factory;

class Movie {
    String movieName;
    Actor actor;

    Movie(String movieName, Actor actor) {
        this.movieName = movieName;
        this.actor = actor;
    }
}
