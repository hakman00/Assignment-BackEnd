package com.kleinpix.assignment7_back_end.model;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity // This tells Hibernate to make a table out of this class
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //declare instance variables
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;

    /*@OneToMany
    private List<Order> order;*/

   /* //create private constructor
    private Customer() {

    }*/

    //create getters
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    /*public List<Order> getOrder() {
        return order;
    }*/

    //create Builder Pattern class
    public static class Builder {
        //create instance variables
        private long id;
        private String name;
        private String surname;
        private String email;
        private String password;

        //private List<Order> order;

        //create the "getters" for the Builder Pattern class
        public Builder id(long value) {
            this.id = value;
            return this;
        }
        public Builder name(String value) {
            this.name = value;
            return this;
        }
        public Builder surname(String value) {
            this.surname = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder password(String value){
            this.password = value;
            return this;
        }
        /*public Builder order(List<Order> value) {
            this.order = value;
            return this;
        }*/
        //create return type for the Builder Pattern class
        public Customer build() {
            return new Customer(this);
        }
    }
    //create Builder Pattern constructor
    public Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.password = builder.password;
        //this.order = builder.order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 62));
    }
}
