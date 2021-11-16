package project.cinema.spring.service;

import project.cinema.spring.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
