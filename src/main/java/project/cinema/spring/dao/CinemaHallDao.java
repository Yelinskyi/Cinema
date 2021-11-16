package project.cinema.spring.dao;

import java.util.List;
import java.util.Optional;
import project.cinema.spring.model.CinemaHall;

public interface CinemaHallDao {
    CinemaHall add(CinemaHall cinemaHall);

    Optional<CinemaHall> get(Long id);

    List<CinemaHall> getAll();
}
