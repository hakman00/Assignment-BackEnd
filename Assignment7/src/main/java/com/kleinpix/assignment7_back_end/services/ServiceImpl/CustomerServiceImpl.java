package com.kleinpix.assignment7_back_end.services.ServiceImpl;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.assignment7_back_end.model.Customer;
import com.kleinpix.assignment7_back_end.repositories.CustomerRepository;
import com.kleinpix.assignment7_back_end.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public Customer read(long id) {
        return customerRepository.findByEmail("email");
    }
    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public void delete(long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer availableEmail(String email) {
        return customerRepository.findByEmail(email);
    }


    /*
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public Customer read(long id) {
        return customerRepository.findBySurname("surname");
    }
    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }
   @Override
    public void delete(long id){
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findByNameAndSurnameAndEmailAndPassword(String name, String Surname,String email,String password){
        return customerRepository.findByNameAndSurnameAndEmailAndPassword("name","surname","email","password");
    }
    @Override
    public Customer findByEmail(String email){
        return customerRepository.findByEmail("email");
    }
    @Override
    public Customer findBySurname(String surname){
        return customerRepository.findByEmail("email");
    }
    @Override
    public Customer findByEmailAndPassword(String email, String password){
        return customerRepository.findByEmailAndPassword("email","password");
    }
    */

    /*
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
    @Override
    public Iterable<Customer> findById (String id){

        return customerRepository.findById(id);
    }
    @Override
    public Iterable<Customer> findByName (String name){

        return customerRepository.findByName(name);
    }
    @Override
    Iterable<Customer> findBySurname (String surname){

        return customerRepository.findBySurname(surname);
    }
    @Override
    public Iterable<Customer> findBySurnameDesc (String surname){

        return customerRepository.findAllByOrderBySurnameDesc();
    }
    @Override
    public Customer findbyIdAndNumberOfPrintsAndPhotobookSizeAndPhotoboothPackage (String id, String name, String surname){

        return customerRepository.findByIdAndNameAndSurname(id, name, surname);
    }
   */
}

