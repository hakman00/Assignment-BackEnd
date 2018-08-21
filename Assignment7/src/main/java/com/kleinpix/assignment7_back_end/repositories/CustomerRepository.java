package com.kleinpix.assignment7_back_end.repositories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/
import com.kleinpix.assignment7_back_end.model.Customer;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    Customer findByEmail(String email);


    /*
    Customer findByNameAndSurnameAndEmailAndPassword(String name, String Surname,String email,String password);
    Customer findByEmail(String email);
    Customer findBySurname(String surname);
    Customer findByEmailAndPassword(String email, String password);
*/
    /*
    Customer findById (long id);
    Iterable<Customer> findByName (String name);
    Iterable<Customer> findBySurname (String surname);
    Iterable<Customer> findByEmail (String email);
    //Iterable<Customer> findByPassword (String password);
    Iterable<Customer> findAllByOrderBySurnameDesc();
    Customer findByIdAndNameAndSurnameAndEmailAndPassword (long id,String name,String surname,String emial, String password);
    Customer deleteBy (long id);
    */
}
