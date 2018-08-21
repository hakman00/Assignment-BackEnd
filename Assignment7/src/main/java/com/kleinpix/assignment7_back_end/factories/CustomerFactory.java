package com.kleinpix.assignment7_back_end.factories;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import com.kleinpix.assignment7_back_end.model.Customer;

import java.util.List;
import java.util.Map;

public class CustomerFactory {

    public static Customer getCustomer(Map<String, String> values)
    {
        Customer customer = new Customer.Builder()
                .name(values.get("name"))
                .surname(values.get("surname"))
                .email(values.get("email"))
                .password(values.get("password"))
                .build();

        return customer;

    }

    /*public static Customer getCustomer(String name, String surname, String email, String password) {
        Customer customer = new Customer.Builder()
                //.id((long) values.get("id"))
                .name(name)         //((String) values.get("name"))
                .surname(surname)   //((String) values.get("surname"))
                .email(email)        //((String) values.get("email"))
                .password(password)     //((String) values.get("password"))
                .build();
        return customer;
    }*/
}
