/*
package com.kleinpix.assignment7_back_end.repositories.RepositoryImpl;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/
/*
import com.kleinpix.assignment7_back_end.model.Customer;
import com.kleinpix.assignment7_back_end.repositories.CustomerRepository;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl repository = null;

    private Map<String, Customer> customerTable;

    private CustomerRepositoryImpl(){
        customerTable = new HashMap<String, Customer>();
    }

    public static CustomerRepositoryImpl getInstance(){
        if(repository == null)
            repository = new CustomerRepositoryImpl();

        return repository;
    }

    public Customer create(Customer customer){
        customerTable.put(customer.getId(),customer);
        Customer savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public Customer read(String id){
        Customer customer = customerTable.get(id);
        return customer;
    }

    public Customer update(Customer customer){
        customerTable.put(customer.getId(),customer);
        Customer savedCustomer = customerTable.get(customer.getId());
        return savedCustomer;
    }

    public void delete(String id){
        customerTable.remove(id);
    }
}
*/