package com.kleinpix.assignment7_back_end.repositories;

import com.kleinpix.assignment7_back_end.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface OrderRepository extends CrudRepository<Order, Long> {

    Iterable<Order> findByOrderDate (Date orderDate);

    //Order findById (String id); //  create(Order order);

    //Order findByOrderNumberAndOrderDate (Date orderNumber, String orderDate); // read(String id);

}
