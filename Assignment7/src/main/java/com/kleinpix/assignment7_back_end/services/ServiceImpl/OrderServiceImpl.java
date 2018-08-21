/*
package com.kleinpix.assignment7_back_end.services.ServiceImpl;

import com.kleinpix.assignment7_back_end.model.Order;
import com.kleinpix.assignment7_back_end.repositories.OrderRepository;
import com.kleinpix.assignment7_back_end.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;


    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order read(long id) {
        return orderRepository.findByOrderDate(orderDate);
    }

    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete(long id) {
        orderRepository.deleteById(id);
    }
*/
/*
    @Override
    public Iterable<Order> find {
        return orderRepository.findAll();
    }

    @Override
    public Order ava(String email) {
        return orderRepository.findByOrderDate("orderDate");
    }
}

*/

/*
    private static OrderServiceImpl service = null;

    OrderRepository repository = OrderRepositoryImpl.getInstance();

    public static OrderServiceImpl getInstance(){
        if(service == null)
            service = new OrderServiceImpl();

        return service;
    }

    public Order create(Order order){
        return repository.create(order);
    }

    public Order read(String id){
        return repository.read(id);
    }

    public Order update(Order order){
        return repository.update(order);
    }

    public void delete(String id){
        repository.delete(id);
    }
}
*/