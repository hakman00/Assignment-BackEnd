package com.kleinpix.assignment7_back_end.services;

import com.kleinpix.assignment7_back_end.model.Order;

public interface OrderService {

    Order create(Order order);
    Order read(String id);
    Order update(Order order);
    void delete(String id);

    Iterable<Order> findAll();
    Iterable<Order> findByOrderDate (String orderDate);
    //Order findbyIdAndOrderNumberAndOrderDate (String id, String orderNumber, String orderDate);
}

