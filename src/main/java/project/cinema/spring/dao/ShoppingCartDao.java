package project.cinema.spring.dao;

import project.cinema.spring.model.ShoppingCart;
import project.cinema.spring.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
