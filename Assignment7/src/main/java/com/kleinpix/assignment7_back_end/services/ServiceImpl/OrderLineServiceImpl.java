/*
package com.kleinpix.assignment7_back_end.services.ServiceImpl;

import com.kleinpix.assignment7_back_end.model.OrderLine;
import com.kleinpix.assignment7_back_end.repositories.OrderLineRepository;
import com.kleinpix.assignment7_back_end.repositories.RepositoryImpl.OrderLineRepositoryImpl;
import com.kleinpix.assignment7_back_end.services.OrderLineService;

public class OrderLineServiceImpl implements OrderLineService {

    private static OrderLineServiceImpl service = null;

    OrderLineRepository repository = OrderLineRepositoryImpl.getInstance();

    public static OrderLineServiceImpl getInstance(){
        if(service == null)
            service = new OrderLineServiceImpl();

        return service;
    }

    public OrderLine create(OrderLine orderLine){
        return repository.create(orderLine);
    }

    public OrderLine read(String id){
        return repository.read(id);
    }

    public OrderLine update(OrderLine orderLine){
        return repository.update(orderLine);
    }

    public void delete(String id){
        repository.delete(id);
    }
}
*/