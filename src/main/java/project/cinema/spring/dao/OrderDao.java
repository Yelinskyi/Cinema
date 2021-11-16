package project.cinema.spring.dao;

import java.util.List;
import project.cinema.spring.model.Order;
import project.cinema.spring.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
