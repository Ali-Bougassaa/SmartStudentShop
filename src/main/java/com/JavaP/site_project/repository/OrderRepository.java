package com.JavaP.site_project.repository;

import com.JavaP.site_project.entity.Order;
import com.JavaP.site_project.entity.OrderBasket;
import com.JavaP.site_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    Order findByUser(User user);

    List<Order> findOrdersByUser(User user);

    public Long countById(Integer id);

}
