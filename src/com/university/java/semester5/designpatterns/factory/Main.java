package com.university.java.semester5.designpatterns.factory;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Location bangalore = new Location(12.97, 77.59);

        Movie movie1 = new Movie("3IDIOTS", new Actor("AMIR KHAN"));
        Movie movie2 = new Movie("RRR", new Actor("Ram Charan"));

        Theatre t1 = new Theatre("PVR", bangalore);
        Screen s1 = new Screen();
        s1.shows.add(new Show(movie1));
        s1.shows.add(new Show(movie2));
        t1.screens.add(s1);

        Theatre t2 = new Theatre("INOX", bangalore);
        Screen s2 = new Screen();
        s2.shows.add(new Show(movie1));
        t2.screens.add(s2);

        List<Theatre> theatres = Arrays.asList(t1, t2);
        SearchController controller = new SearchController();

        System.out.println("Search by movie:");
        for (Theatre t : controller.search(
                bangalore, "3IDIOTS", SearchBy.MOVIE_NAME, theatres)) {
            System.out.println(t.name);
        }

        System.out.println("\nSearch by actor:");
        for (Theatre t : controller.search(
                bangalore, "Ram Charan", SearchBy.ACTOR_NAME, theatres)) {
            System.out.println(t.name);
        }
    }
}
