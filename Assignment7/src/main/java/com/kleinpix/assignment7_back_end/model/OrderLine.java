/*
package com.kleinpix.assignment7_back_end.model;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/
/*
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class OrderLine implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //declare instance variables
    private String id;
    private String quantity;

    @OneToOne
    private Packages packages;  // = new Packages();

    //create private constructor
    private OrderLine(){

    }

    //create getters
    public String getQuantity() {
        return quantity;
    }

    public String getId() {
        return id;
    }

    public Packages getPackages() {
        return packages;
    }

    //create Builder Pattern class
    public static class Builder{
        //create instance variables
        private String id;
        private String quantity;

        private Packages packages;

        //create the "getters" for the Builder Pattern class
        public Builder id(String value){
            this.id = value;
            return this;
        }
        public Builder quantity(String value){
            this.quantity = value;
            return this;
        }
        public Builder packages(Packages value){
            this.packages = value;
            return this;
        }
        //create return type for the Builder Pattern class
        public OrderLine build(){
            return new OrderLine(this);
        }
    }
    //create Builder Pattern constructor
    public OrderLine(Builder builder) {
        this.id = builder.id;
        this.quantity = builder.quantity;
        this.packages = builder.packages;
    }
}
*/