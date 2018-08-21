/*
package com.kleinpix.assignment7_back_end.repositories.RepositoryImpl;

import com.kleinpix.assignment7_back_end.model.OrderLine;
import com.kleinpix.assignment7_back_end.repositories.OrderLineRepository;

import java.util.HashMap;
import java.util.Map;

public class OrderLineRepositoryImpl implements OrderLineRepository {

    private static OrderLineRepositoryImpl repository = null;

    private Map<String, OrderLine> orderLineTable;

    private OrderLineRepositoryImpl(){
        orderLineTable = new HashMap<String, OrderLine>();
    }

    public static OrderLineRepositoryImpl getInstance(){
        if(repository == null)
            repository = new OrderLineRepositoryImpl();

        return repository;
    }

    public OrderLine create(OrderLine orderLine){
        orderLineTable.put(orderLine.getId(),orderLine);
        OrderLine savedOrderLine = orderLineTable.get(orderLine.getId());
        return savedOrderLine;
    }

    public OrderLine read(String id){
        OrderLine orderLine = orderLineTable.get(id);
        return orderLine;
    }

    public OrderLine update(OrderLine orderLine){
        orderLineTable.put(orderLine.getId(),orderLine);
        OrderLine savedOrderLine = orderLineTable.get(orderLine.getId());
        return savedOrderLine;
    }

    public void delete(String id){

        orderLineTable.remove(id);
    }
}
*/