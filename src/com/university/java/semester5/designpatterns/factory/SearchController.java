package com.university.java.semester5.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

class SearchController {
    private final Factory factory = new Factory();

    public List<Theatre> search(
            Location location, String word, SearchBy filter,
            List<Theatre> allTheatres) {

        List<Theatre> nearby = new ArrayList<>();

        for (Theatre t : allTheatres) {
            if (t.location.lat == location.lat
                    && t.location.lng == location.lng) {
                nearby.add(t);
            }
        }

        Search search = factory.getInstance(filter);
        return search.search(nearby, word);
    }
}
