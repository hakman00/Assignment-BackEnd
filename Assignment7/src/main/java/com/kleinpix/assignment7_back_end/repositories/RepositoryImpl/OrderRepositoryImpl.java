/*
package com.kleinpix.assignment7_back_end.repositories.RepositoryImpl;

import com.kleinpix.assignment7_back_end.model.Order;
import com.kleinpix.assignment7_back_end.repositories.OrderRepository;

import java.util.HashMap;
import java.util.Map;

public class OrderRepositoryImpl implements OrderRepository {

    private static OrderRepositoryImpl repository = null;

    private Map<String, Order> orderTable;

    private OrderRepositoryImpl(){
        orderTable = new HashMap<String, Order>();
    }

    public static OrderRepositoryImpl getInstance(){
        if(repository == null)
            repository = new OrderRepositoryImpl();

        return repository;
    }

    public Order create(Order order){
        orderTable.put(order.getId(),order);
        Order savedOrder = orderTable.get(order.getId());
        return savedOrder;
    }

    public Order read(String id){
        Order order = orderTable.get(id);
        return order;
    }

    public Order update(Order order){
        orderTable.put(order.getId(),order);
        Order savedOrder = orderTable.get(order.getId());
        return savedOrder;
    }

    public void delete(String id){

        orderTable.remove(id);
    }
}
*/