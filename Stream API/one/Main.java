package com.SreamAPI.One;
import java.util.*;
import java.util.stream.*;
public class Main {
    static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Dhurandhar 1", 8.5, 2025),
                new Movie("Dhurandhar 2", 9.0, 2026),
                new Movie("Dune 3", 9.5, 2026),
                   );
        List<Movie> topMovies = movies.stream()
                .filter(m -> m.year >= 2022)
                .sorted((m1,m2) -> {
                    if(m2.rating != m1.rating)
                        return Double.compare(m2.rating, m1.rating);
                    else return Integer.compare(m2.year, m1.year);
                })
                .limit(5)
                .collect(Collectors.toList());
        topMovies.forEach(System.out::println);
    }
}
