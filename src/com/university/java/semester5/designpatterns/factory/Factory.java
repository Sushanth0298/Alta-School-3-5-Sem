package com.university.java.semester5.designpatterns.factory;

class Factory {
    public Search getInstance(SearchBy filter) {
        if (filter == SearchBy.MOVIE_NAME) {
            return new SearchByMovieName();
        } else if (filter == SearchBy.ACTOR_NAME) {
            return new SearchByActorName();
        }

        throw new IllegalArgumentException("Invalid search type");
    }
}
