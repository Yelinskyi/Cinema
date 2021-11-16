package project.cinema.spring.service;

import java.util.List;
import project.cinema.spring.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
