package project.cinema.spring.service;

import java.util.Optional;
import project.cinema.spring.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
