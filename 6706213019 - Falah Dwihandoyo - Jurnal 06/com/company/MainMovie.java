package com.company;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.1,"Iron Man",2008));
        list.add(new Movie(8.3,"Avengers: Endgame",2019));
        list.add(new Movie(8.3,"Ant Man",2015));
        list.add(new Movie(8.2,"Toy Story 3",2010));
        list.add(new Movie(8.4,"Avengers: Infinity War",2018));
        System.out.println("Film sebelum diurutkan : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
        Collections.sort(list);
        System.out.println("\nFilm sesudah diurutkan : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + "-" +
                    movie.getRating() + "-" +
                    movie.getYear());
        }
    }
}
