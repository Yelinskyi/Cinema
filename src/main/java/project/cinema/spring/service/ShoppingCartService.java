package project.cinema.spring.service;

import project.cinema.spring.model.MovieSession;
import project.cinema.spring.model.ShoppingCart;
import project.cinema.spring.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
