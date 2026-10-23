package com.university.java.semester5.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

class SearchByMovieName implements Search {
    public List<Theatre> search(List<Theatre> theatres, String word) {
        List<Theatre> result = new ArrayList<>();

        for (Theatre t : theatres) {
            for (Screen s : t.screens) {
                for (Show sh : s.shows) {
                    if (sh.movie.movieName.equalsIgnoreCase(word)) {
                        result.add(t);
                        break;
                    }
                }
            }
        }
        return result;
    }
}
