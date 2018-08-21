package com.kleinpix.assignment7_back_end.services;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.assignment7_back_end.model.Customer;

import java.util.Optional;

public interface CustomerService {

    Customer create(Customer customer);
    Customer read(long id);
    Customer update(Customer customer);
    void delete(long id);

    Iterable<Customer> findAll();
    Customer availableEmail(String email);


    /*
    Customer create(Customer customer);
    Customer read(long id);
    Customer update(Customer customer);
    void delete(long id);

    Customer findByNameAndSurnameAndEmailAndPassword(String name, String Surname,String email,String password);
    Customer findByEmail(String email);
    Customer findBySurname(String surname);
    Customer findByEmailAndPassword(String email, String password);
    */
    /*
    Iterable<Customer> findAll();
    Iterable<Customer> findByName (String name);
    Iterable<Customer> findBySurname (String surname);
    Iterable<Customer> findBySurnameDesc (String surname);
    Customer findByEmailAndPassword(String email, String password);
    Customer findbyIdAndNumberOfPrintsAndPhotobookSizeAndPhotoboothPackage (String id, String name, String surname);
    //Iterable<Customer> findById (String id);
    */
    }
