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
import java.util.List;
import java.util.Objects;

@Entity
public class Packages implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //declare instance variables
    private String id;
    private String packageName;
    private double packagePrice;

    @OneToMany
    private List<Additional> additional;

    //create private constructor
    private Packages() {

    }

    //create getters
    public String getId() {
        return id;
    }

    public String getPackageName() {
        return packageName;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public List<Additional> getAdditional() {
        return additional;
    }

    //create Builder Pattern class
    public static class Builder {
        //create instance variables
        private String id;
        private String packageName;
        private double packagePrice;

        private List<Additional> additional;

        //create the "getters" for the Builder Pattern class
        public Builder id(String values) {
            this.id = values;
            return this;
        }

        public Builder packageName(String values) {
            this.packageName = values;
            return this;
        }

        public Builder packagePrice(double values) {
            this.packagePrice = values;
            return this;
        }

        public Builder additional(List<Additional> values) {
            this.additional = values;
            return this;
        }

        public Packages build() {
            return new Packages(this);
        }
    }

    public Packages(Builder builder) {
        this.id = builder.id;
        this.packageName = builder.packageName;
        this.packagePrice = builder.packagePrice;
        this.additional = builder.additional;
    }
}
*/
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Packages packages = (Packages) o;
        return id == packages.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
*/