package project.cinema.spring.service;

import java.util.List;
import project.cinema.spring.model.Order;
import project.cinema.spring.model.ShoppingCart;
import project.cinema.spring.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
