package project.cinema.spring.dao;

import java.util.List;
import java.util.Optional;
import project.cinema.spring.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
