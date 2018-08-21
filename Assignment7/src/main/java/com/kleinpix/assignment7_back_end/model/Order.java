
package com.kleinpix.assignment7_back_end.model;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //declare instance variables
    private long id;
    private Date orderDate;

    //@OneToMany
    //private List<OrderLine> orderLine;

    //create private constructor
    private Order() {

    }

    //create getters
    public long getId() {
        return id;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    //public List<OrderLine> getOrderLine() {
    //    return orderLine;
    //}

    //create Builder Pattern class
    public static class Builder {
        //create instance variables
        private long id;
        private Date orderDate;

        //private List<OrderLine> orderLine;

        //create the "getters" for the Builder Pattern class
        public Builder id(long value) {
            this.id = value;
            return this;
        }
        public Builder orderDate(Date value) {
            this.orderDate = value;
            return this;
        }
        //public Builder orderLine(List<OrderLine> value) {
        //    this.orderLine = value;
        //    return this;
        //}

        //create return type for the Builder Pattern class
        public Order build() {
            return new Order(this);
        }
    }
    //create Builder Pattern const
    public Order(Builder builder) {
        this.id = builder.id;
        this.orderDate = builder.orderDate;
        //this.orderLine = builder.orderLine;
    }
}
